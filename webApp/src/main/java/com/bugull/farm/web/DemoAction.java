package com.bugull.farm.web;

import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JasonMao on 2017/7/12.
 */
@Controller
public class DemoAction {

    @MotanReferer
    HelloDemoApi api;

    @ResponseBody
    @RequestMapping("demo")
    public Map demo(){
        System.out.println( "demo ");
        Map map = new HashMap();
        try{
            String str = api.hellow() ;
            map.put("xx" ,str);
        }catch (Exception e){
            e.printStackTrace();
        }

        return map ;
    }
}
