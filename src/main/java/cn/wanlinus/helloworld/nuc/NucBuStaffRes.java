package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author wanli
 * @date 2019-07-01 13:22
 */
public class NucBuStaffRes implements Serializable {
    @JsonProperty("business_name")
    private String businessName;

    @JsonProperty("birthdate")
    private Long birthdate;

    @JsonProperty("empl_id")
    private String emplId;

    @JsonProperty("sex")
    private String sex;

    @JsonProperty("business_unit")
    private String businessUnit;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("working_time")
    private Long workingTime;

    @JsonProperty("staffOrganizeList")
    private List<NucStaffOrganize> staffOrganizes;

    @JsonProperty("account_id")
    private String accountId;

    @JsonProperty("empl_name")
    private String emplName;

    @JsonProperty("entering_time")
    private Long enteringTime;

    @JsonProperty("objectProp")
    private Map<String, Object> objectProp;

    @JsonProperty("obj_type")
    private String objType;

    public NucBuStaffRes() {
    }

    public NucBuStaffRes(String businessName, Long birthdate, String emplId, String sex, String businessUnit, String uid, Long workingTime, List<NucStaffOrganize> staffOrganizes, String accountId, String emplName, Long enteringTime, Map<String, Object> objectProp, String objType) {
        this.businessName = businessName;
        this.birthdate = birthdate;
        this.emplId = emplId;
        this.sex = sex;
        this.businessUnit = businessUnit;
        this.uid = uid;
        this.workingTime = workingTime;
        this.staffOrganizes = staffOrganizes;
        this.accountId = accountId;
        this.emplName = emplName;
        this.enteringTime = enteringTime;
        this.objectProp = objectProp;
        this.objType = objType;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Long getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Long birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmplId() {
        return emplId;
    }

    public void setEmplId(String emplId) {
        this.emplId = emplId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Long getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(Long workingTime) {
        this.workingTime = workingTime;
    }

    public List<NucStaffOrganize> getStaffOrganizes() {
        return staffOrganizes;
    }

    public void setStaffOrganizes(List<NucStaffOrganize> staffOrganizes) {
        this.staffOrganizes = staffOrganizes;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public Long getEnteringTime() {
        return enteringTime;
    }

    public void setEnteringTime(Long enteringTime) {
        this.enteringTime = enteringTime;
    }

    public Map<String, Object> getObjectProp() {
        return objectProp;
    }

    public void setObjectProp(Map<String, Object> objectProp) {
        this.objectProp = objectProp;
    }

    public String getObjType() {
        return objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
