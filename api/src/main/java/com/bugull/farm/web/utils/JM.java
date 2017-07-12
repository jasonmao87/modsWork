package com.bugull.farm.web.utils;


import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;
/**
 * Created by JasonMao on 2017/7/12.
 */
public class JM {


    //测试
    public static void main(String args[]) throws UnsupportedEncodingException, NoSuchAlgorithmException {
//待加密内容
        String str = "000222";
//密码，长度要是8的倍数
        String password =   md5("00000000000000000");

        byte[] result = JM.encrypt(str.getBytes( ),password);
        System.out.println("加密后："+new String(result));

        String mw =  getBase64( new String(result)) ;
        System.out.println("base 64 " +  mw);

        String realResult =  getFromBase64( mw);
        System.out.println( realResult);
        for(byte bt :result){
            System.out.print( bt +" ");
        }
        System.out.println();
        result = realResult.getBytes();
        for(byte bt :realResult.getBytes()){
            System.out.print( bt +" ");
        }
        System.out.println();
        System.out.println( realResult.equals( new String(result) ));
        System.out.println(result == realResult.getBytes());
        //直接将如上内容解密
        try {
            byte[] decryResult = JM.decrypt( realResult.getBytes(), password);
            System.out.println("解密后："+new String(decryResult));
        } catch (Exception e1) {
            //e1.printStackTrace();
        }

    }

    public static String md5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
        MessageDigest md5=MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的字符串
        String newstr=base64en.encode(md5.digest(str.getBytes("UTF-8")));
        return newstr;
    }

    // 加密
    public static String getBase64(String str) {
        byte[] b = null;
        String s = null;
        b = str.getBytes();
        if (b != null) {
            s = new BASE64Encoder().encode(b);
        }
        return s;
    }

    // 解密
    public static String getFromBase64(String s) {
        byte[] b = null;
        String result = null;
        if (s != null) {
            BASE64Decoder decoder = new BASE64Decoder();
            try {
                b = decoder.decodeBuffer(s);
                result = new String(b);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
    /**
     * 加密
     * @param datasource byte[]
     * @param password String
     * @return byte[]
     */
    public static byte[] encrypt(byte[] datasource, String password) {
        try{
            SecureRandom random = new SecureRandom();
            DESKeySpec desKey = new DESKeySpec(password.getBytes());
            //创建一个密匙工厂，然后用它把DESKeySpec转换成
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey securekey = keyFactory.generateSecret(desKey);
            //Cipher对象实际完成加密操作
            Cipher cipher = Cipher.getInstance("DES");
            //用密匙初始化Cipher对象
            cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
            //现在，获取数据并加密
            //正式执行加密操作
            return cipher.doFinal(datasource);
        }catch(Throwable e){
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 解密
     * @param src byte[]
     * @param password String
     * @return byte[]
     * @throws Exception
     */
    public static byte[] decrypt(byte[] src, String password) throws Exception {
// DES算法要求有一个可信任的随机数源
        SecureRandom random = new SecureRandom();
// 创建一个DESKeySpec对象
        DESKeySpec desKey = new DESKeySpec(password.getBytes());
// 创建一个密匙工厂
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
// 将DESKeySpec对象转换成SecretKey对象
        SecretKey securekey = keyFactory.generateSecret(desKey);
// Cipher对象实际完成解密操作
        Cipher cipher = Cipher.getInstance("DES");
// 用密匙初始化Cipher对象
        cipher.init(Cipher.DECRYPT_MODE, securekey, random);
// 真正开始解密操作
        return cipher.doFinal(src);
    }
}
