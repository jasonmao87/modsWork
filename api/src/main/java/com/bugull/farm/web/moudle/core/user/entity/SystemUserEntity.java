package com.bugull.farm.web.moudle.core.user.entity;

import com.bugull.farm.web.moudle.core.base.BaseEntity;
import com.bugull.mongo.SimpleEntity;
import com.bugull.mongo.annotations.Entity;

import java.util.Date;

/**
 * 系统用户 实体类
 * Created by JasonMao on 2017/7/11.
 */
@Entity
public class SystemUserEntity  extends BaseEntity {
    private static final long serialVersionUID = 4180410884151302114L;

    String username ;

    String password ;

    /**
     * 是否需要二次加密
     */
    Integer dblMd5 ;

    /**
     * 二次加密 ，随机字符串
     */
    String randomMd5Str ;

    String userNick ;

    String realName ;

    String idCode ;

    String addrCountry ;

    String addrProvince ;

    String addrCity ;

    String addrDistrict ;

    String addrStreet ;

    String address ;

    String sex ;

    Date birthDay ;

    String mobiTel ;

    String faxTel ;

    String tel ;

    String email ;

    String roleName ;

    String  roleId ;

    Date createTime ;

    Date lastLoginTime ;

    Integer status ;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getDblMd5() {
        return dblMd5;
    }

    public void setDblMd5(Integer dblMd5) {
        this.dblMd5 = dblMd5;
    }

    public String getRandomMd5Str() {
        return randomMd5Str;
    }

    public void setRandomMd5Str(String randomMd5Str) {
        this.randomMd5Str = randomMd5Str;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getAddrCountry() {
        return addrCountry;
    }

    public void setAddrCountry(String addrCountry) {
        this.addrCountry = addrCountry;
    }

    public String getAddrProvince() {
        return addrProvince;
    }

    public void setAddrProvince(String addrProvince) {
        this.addrProvince = addrProvince;
    }

    public String getAddrCity() {
        return addrCity;
    }

    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity;
    }

    public String getAddrDistrict() {
        return addrDistrict;
    }

    public void setAddrDistrict(String addrDistrict) {
        this.addrDistrict = addrDistrict;
    }

    public String getAddrStreet() {
        return addrStreet;
    }

    public void setAddrStreet(String addrStreet) {
        this.addrStreet = addrStreet;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getMobiTel() {
        return mobiTel;
    }

    public void setMobiTel(String mobiTel) {
        this.mobiTel = mobiTel;
    }

    public String getFaxTel() {
        return faxTel;
    }

    public void setFaxTel(String faxTel) {
        this.faxTel = faxTel;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
