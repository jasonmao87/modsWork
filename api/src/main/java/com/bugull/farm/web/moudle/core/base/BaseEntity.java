package com.bugull.farm.web.moudle.core.base;

import com.bugull.mongo.SimpleEntity;
import org.apache.commons.beanutils.BeanMap;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by JasonMao on 2017/7/11.
 */
public class BaseEntity extends SimpleEntity {

    private static final long serialVersionUID = 7727546606431928809L;


    @Override
    public String toString() {
        try{
            return toString( this);
        }catch (Exception e){
            e.printStackTrace();
            return super.toString() ;
        }
    }

    private   String  toString(Object model) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if(model ==null){
            return "对象没有初始化 ！";
        }
        StringBuffer sb  = new StringBuffer("\n").append(model.getClass().getName());
        sb.append("[").append(model.getClass().getPackage().toString()).append( "]") ;
        Field[] field = model.getClass().getDeclaredFields();        //获取实体类的所有属性，返回Field数组
        sb.append("{");
        for(int j=0 ; j<field.length ; j++){     //遍历所有属性
            String name = field[j].getName();    //获取属性的名字
            sb.append("\n\t").append( name ).append(" : ") ;
            name = name.substring(0,1).toUpperCase()+name.substring(1); //将属性的首字符大写，方便构造get，set方法
            if(name.toUpperCase().equals("serialVersionUID".toUpperCase())){
                continue;
            }
            Method m = model.getClass().getMethod("get"+name);
            String type = field[j].getGenericType().toString();    //获取属性的类型
            if(type.equals("class java.lang.String")){   //如果type是类类型，则前面包含"class "，后面跟类名
                String value = (String) m.invoke(model);    //调用getter方法获取属性值
                if(value != null){
                    sb.append( value) ;
                }else{
                    sb.append( "未赋值（NULL）");
                }
            }
            else if(type.equals("class java.lang.Integer")){
                Integer value = (Integer) m.invoke(model);
                if(value != null){
                    sb.append( value) ;
                }
            }
            else if(type.equals("class java.lang.Short")){
                Short value = (Short) m.invoke(model);
                if(value != null){
                    sb.append(value);               }
            }
            else if(type.equals("class java.lang.Double")){
                Double value = (Double) m.invoke(model);
                if(value != null){
                    sb.append( value) ;
                }
            }
            else if(type.equals("class java.lang.Boolean")){
                Boolean value = (Boolean) m.invoke(model);
                if(value != null){
                    sb.append( value) ;
                }
            }
            else if(type.equals("class java.util.Date")){
                Date value = (Date) m.invoke(model);
                if(value != null){
                    sb.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format( value)  );
                }
            }else{

            }

        }
        sb.append("\n}");
        return sb.toString() ;
    }

    /**
     * 帮助@ResponseBody 封装Ext Form 需要的json对象
     * @return
     */
    public static Map extformMap(Object self, String info){
        Map map = new HashMap();
        map.put("success", self!=null) ;
        map.put("data" ,self);
        map.put("info" , info) ;
        return map ;
    }
    /**
     * 帮助@ResponseBody 封装Ext Form 需要的json对象
     * @return
     */
    public static Map extformMap( Object self){
        Map map = new HashMap();
        map.put("success", self!=null) ;
        map.put("data" ,self);
        map.put("info" , "") ;
        return map ;
    }

    /**
     * 帮助@ResponseBody 封装Ext Form 需要的json对象
     * @return
     */
    public  Map extformMap(){
        Map map = new HashMap();
        map.put("success",this!=null) ;
        map.put("data" ,this);
        map.put("info" , "") ;
        map.put("status" ,true);
        return map ;
    }


    public static String extGridStore(Object model ){
        if(model ==null){
            return "对象没有初始化 ！";
        }
        StringBuffer sb  = new StringBuffer("[");
        Field[] field = model.getClass().getDeclaredFields();        //获取实体类的所有属性，返回Field数组
        for(int j=0 ; j<field.length ; j++){     //遍历所有属性
            if( j > 0){
                sb.append(" ,") ;
            }
            String name = field[j].getName();    //获取属性的名字
            sb.append("'").append( name ).append("'") ;
        }
        sb.append("]");
        return sb.toString() ;
    }

    @Override
    public Object clone()  {
        Object o = null;
        try{
            o  =  super.clone();
            return o ;
        }catch (Exception e){

        }
        return  null;
    }

    public static <T> Map<String ,Object> EntityToMap( T t ){

        if(t == null)
            return null;
        Map map =  new BeanMap(t);
        Map returnMap = new HashMap();
        for(Object key : map.keySet()){
            Object v = map.get( key);
            returnMap.put(key,v );
        }
        return returnMap;
    }

    public <T> T mapToEntity(Map map ,Class<T> cls){
        T bean = null;
        try {
            bean = cls.newInstance();
            BeanUtils.populate(bean, map);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return bean;
    }

}
