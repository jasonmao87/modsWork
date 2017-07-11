package com.bugull.farm.web.moudle.core.mods.entity;

import com.bugull.farm.web.moudle.core.base.BaseEntity;

import java.util.Date;

/**
 * Created by JasonMao on 2017/7/11.
 */
public class SystemModsUriEntity extends BaseEntity {
    private static final long serialVersionUID = -3693990368672933950L;

    String modsId ;
    String uri ;
    /**
     * get or post
     */
    String requestMethod ;

    String title ;

    String description ;

    String createUserId ;

    String createUserNick ;

    String createUserRealName ;

    Date createTime ;

    Date lastUpdateTime ;

    String updateUserId ;

    String updateUserNick ;

    String updateUserRealName ;

    Integer status ;

    public String getModsId() {
        return modsId;
    }

    public void setModsId(String modsId) {
        this.modsId = modsId;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getUpdateUserNick() {
        return updateUserNick;
    }

    public void setUpdateUserNick(String updateUserNick) {
        this.updateUserNick = updateUserNick;
    }

    public String getUpdateUserRealName() {
        return updateUserRealName;
    }

    public void setUpdateUserRealName(String updateUserRealName) {
        this.updateUserRealName = updateUserRealName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
