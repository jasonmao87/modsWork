package com.bugull.farm.web.moudle.core.role.entity;

import com.bugull.farm.web.moudle.core.base.BaseEntity;
import com.bugull.mongo.SimpleEntity;
import com.bugull.mongo.annotations.Entity;

/**
 * 系统角色表
 * Created by JasonMao on 2017/7/11.
 */
@Entity
public class SystemRoleEntity extends BaseEntity {
    private static final long serialVersionUID = -9071401749331371449L;

    String roleName ;
    /**
     * 是否root权限
     */
    String isRoot ;

    /**
     * 是否允许授权
     */
    String allowAuth ;

    /**
     * 状态
     */
    String status ;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(String isRoot) {
        this.isRoot = isRoot;
    }

    public String getAllowAuth() {
        return allowAuth;
    }

    public void setAllowAuth(String allowAuth) {
        this.allowAuth = allowAuth;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
