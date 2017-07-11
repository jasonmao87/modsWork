package com.bugull.farm.web.init;

/**
 * Created by JasonMao on 2017/7/11.
 */
public class MyApplication {
    private MyApplication() {
    }
    public static MyApplication getInstance() {
        return Holder.instance;
    }
    private static class Holder {
        final static MyApplication instance = new MyApplication();
    }

    /**
     * 启动服务
     */
    public void start(){

    }

    /**
     * 销毁服务 在shutdown 时调用
     */
    public void destory(){

    }



}
