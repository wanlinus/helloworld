package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class PaasUcStaff implements Serializable {
    @JsonProperty("business_name")
    private String businessName;

    @JsonProperty("working_time")
    private Date workingTime;

    @JsonProperty("account_id")
    private String accountId;

    @JsonProperty("birthdate")
    private Date birthdate;

    @JsonProperty("empl_id")
    private String emplId;

    @JsonProperty("empl_name")
    private String emplName;

    @JsonProperty("entering_time")
    private Date enteringTime;

    @JsonProperty("sex")
    private String sex;

    @JsonProperty("isValid")
    private String isValid;

    @JsonProperty("objectProp")
    private Map<String, Object> objectProp;

    @JsonProperty("id")
    private String id;

    @JsonProperty("business_unit")
    private String businessUnit;

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Date getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(Date workingTime) {
        this.workingTime = workingTime;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmplId() {
        return emplId;
    }

    public void setEmplId(String emplId) {
        this.emplId = emplId;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public Date getEnteringTime() {
        return enteringTime;
    }

    public void setEnteringTime(Date enteringTime) {
        this.enteringTime = enteringTime;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public Map<String, Object> getObjectProp() {
        return objectProp;
    }

    public void setObjectProp(Map<String, Object> objectProp) {
        this.objectProp = objectProp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
