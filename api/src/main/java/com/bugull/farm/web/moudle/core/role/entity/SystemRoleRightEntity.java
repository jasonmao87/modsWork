package com.bugull.farm.web.moudle.core.role.entity;

import com.bugull.farm.web.moudle.core.base.BaseEntity;

/**
 * 角色授表 - 对应角色 可以执行的 URI 请求
 * Created by JasonMao on 2017/7/11.
 */
public class SystemRoleRightEntity extends BaseEntity {

    private static final long serialVersionUID = 7347003616095769871L;

    String roleId ;

    String uri  ;

    /**
     * 模块ID
     */
    String modsId ;

    /**
     * 模块名称
     */
    String modsName ;

    /**
     * 请求方法名
     */
    String methondName ;

    /**
     * 事件描述
     */
    String eventInfo ;


    /**
     * 是否允许 get 请求
     */
    Integer allowGet ;

    /**
     * 是否允许 post 请求
     */
    Integer allowPost ;


    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getModsId() {
        return modsId;
    }

    public void setModsId(String modsId) {
        this.modsId = modsId;
    }

    public String getModsName() {
        return modsName;
    }

    public void setModsName(String modsName) {
        this.modsName = modsName;
    }

    public String getMethondName() {
        return methondName;
    }

    public void setMethondName(String methondName) {
        this.methondName = methondName;
    }

    public String getEventInfo() {
        return eventInfo;
    }

    public void setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
    }

    public Integer getAllowGet() {
        return allowGet;
    }

    public void setAllowGet(Integer allowGet) {
        this.allowGet = allowGet;
    }

    public Integer getAllowPost() {
        return allowPost;
    }

    public void setAllowPost(Integer allowPost) {
        this.allowPost = allowPost;
    }
}
