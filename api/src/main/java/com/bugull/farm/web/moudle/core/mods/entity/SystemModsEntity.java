package com.bugull.farm.web.moudle.core.mods.entity;

import com.bugull.farm.web.moudle.core.base.BaseEntity;

import java.util.Date;

/**
 * 系统模块 实体类
 * Created by JasonMao on 2017/7/11.
 */
public class SystemModsEntity extends BaseEntity {

    private static final long serialVersionUID = 8376552244590359193L;

    String name ;

    String description ;

    Date createTime ;

    Date lastUpdateTime ;

    String createUserId ;

    String createUserNick ;

    String createUserRealName ;

    String baseUri ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }


    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserNick() {
        return createUserNick;
    }

    public void setCreateUserNick(String createUserNick) {
        this.createUserNick = createUserNick;
    }

    public String getCreateUserRealName() {
        return createUserRealName;
    }

    public void setCreateUserRealName(String createUserRealName) {
        this.createUserRealName = createUserRealName;
    }

    public String getBaseUri() {
        return baseUri;
    }

    public void setBaseUri(String baseUri) {
        this.baseUri = baseUri;
    }
}
