package com.bugull.farm.web.init;

import com.bugull.farm.web.HelloDemoApi;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

/**
 * Created by JasonMao on 2017/7/11.
 */
@MotanService(export = "8002")
public class BaseDemoService implements HelloDemoApi {

    public String hellow() {
        System.out.println("草 ！");
        return "hellow cao ";
    }
}
