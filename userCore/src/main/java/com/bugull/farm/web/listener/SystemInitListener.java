package com.bugull.farm.web.listener;

import com.weibo.api.motan.common.MotanConstants;
import com.weibo.api.motan.config.springsupport.*;
import com.weibo.api.motan.util.MotanSwitcherUtil;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by JasonMao on 2017/7/11.
 */
public class SystemInitListener implements ServletContextListener {



    public void contextInitialized(ServletContextEvent servletContextEvent) {
        MotanSwitcherUtil.setSwitcherValue(MotanConstants.REGISTRY_HEARTBEAT_SWITCHER, true);
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    @Bean
    public AnnotationBean motanAnnotationBean() {
        AnnotationBean motanAnnotationBean = new AnnotationBean();
        motanAnnotationBean.setPackage("com.bugull.farm.web");
        return motanAnnotationBean;
    }

    @Bean(name = "demoMotan")
    public ProtocolConfigBean protocolConfig1() {
        ProtocolConfigBean config = new ProtocolConfigBean();
        config.setDefault(true);
        config.setName("motan");
        config.setMaxContentLength(1048576);
        return config;
    }

    @Bean(name = "registry")
    public RegistryConfigBean registryConfig() {
        RegistryConfigBean config = new RegistryConfigBean();
        // 本地配置
        /*
        config.setRegProtocol("local");
        */
        // zookeeper 配置
        config.setRegProtocol("zookeeper");
        config.setAddress("121.40.115.131:2181,120.26.109.144:2181");
        //config.setPort(2181);
        config.setName("zookeeper");
        return config;
    }


    @Bean(name = "motantestClientBasicConfig")
    public BasicRefererConfigBean baseRefererConfig() {
        BasicRefererConfigBean config = new BasicRefererConfigBean();

        config.setGroup("default_rpc");
        config.setAccessLog(false);
        config.setShareChannel(true);
        config.setModule("motan");
        config.setApplication("webApp");
        config.setRegistry("registry");
        System.out.println("set client ");
        config.setThrowException(false);
        return config;
    }
}
