package com.bugull.farm.web.init;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * Created by JasonMao on 2017/7/12.
 */
@Component
public class Destory  {

    @PreDestroy
    public void destory() {

        System.out.println("我被销毁了、、、、、我是用的@PreDestory的方式、、、、、、");
        System.out.println("我被销毁了、、、、、我是用的@PreDestory的方式、、、、、、");
    }

}
