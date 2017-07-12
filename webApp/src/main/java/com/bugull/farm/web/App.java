package com.bugull.farm.web;

import com.weibo.api.motan.common.MotanConstants;
import com.weibo.api.motan.config.springsupport.AnnotationBean;
import com.weibo.api.motan.config.springsupport.BasicRefererConfigBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;
import com.weibo.api.motan.util.MotanSwitcherUtil;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by JasonMao on 2017/7/11.
 */


@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages={"com.bugull.farm.web"})
public class App extends SpringBootServletInitializer{


    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        System.out.println("system init ....");
         MotanSwitcherUtil.setSwitcherValue(MotanConstants.REGISTRY_HEARTBEAT_SWITCHER, true);
        return application.sources(App.class);
    }



    @Bean
    public AnnotationBean motanAnnotationBean() {
        System.out.println("motanAnnotationBean init ");
        AnnotationBean motanAnnotationBean = new AnnotationBean();
        motanAnnotationBean.setPackage("com.bugull.farm.web");
        return motanAnnotationBean;
    }

    @Bean(name = "demoMotan")
    public ProtocolConfigBean protocolConfig1() {
        System.out.println("protocolConfig1  init ");

        ProtocolConfigBean config = new ProtocolConfigBean();
        config.setDefault(true);
        config.setName("motan");
        config.setMaxContentLength(1048576);
        return config;
    }

    @Bean(name = "registry")
    public RegistryConfigBean registryConfig() {
        System.out.println("registry  init ");

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
        System.out.println(" motantestClientBasicConfig init ");
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
