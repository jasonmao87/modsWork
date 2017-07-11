package com.bugull.farm.web;

import com.bugull.farm.web.moudle.core.user.entity.SystemUserEntity;
import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by JasonMao on 2017/7/11.
 */
@Controller
@RequestMapping("/")
public class Hello {

    @MotanReferer
    helloApi helloApi;


    @ResponseBody
    @RequestMapping("hello")
    public Map hello(){
        System.out.println("hello");
        try{

            helloApi.hellow();
        }catch (Exception e){
            e.printStackTrace();
        }
         return new SystemUserEntity().extformMap();
    }

    public static void main(String[] args) {
        System.out.println((new SystemUserEntity()).toString());

     }


}
