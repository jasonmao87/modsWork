package com.bugull.farm.web.constant;

/**
 * 状态码 常量
 * Created by JasonMao on 2017/7/11.
 */
public class STATUS {

    /**
     * 正常状态：是、正常
     */
    public final static Integer STATUS_OK = 1 ;
    /**
     * 错误状态：否，错误
     */
    public final static Integer STATUS_NO = 0 ;

    /**
     * 锁定状态
     */
    public final static Integer STATUS_LOCK = -1 ;

    /**
     *  警告状态
     */
    public final static Integer STATUS_WARN = -3 ;

    /**
     * 删除状态 （标记为已经删除状态，软删除 ）
     */
    public final static Integer STATUS_DEL = -99 ;


    /**
     * 忙状态
     */
    public final static Integer STATUS_BUSY = 3 ;

    /**
     * 等待状态
     */
    public final static Integer STATUS_WAIT = 5 ;

    /**
     * 正在执行
     */
    public final static Integer STATUS_ING = 7 ;



}
