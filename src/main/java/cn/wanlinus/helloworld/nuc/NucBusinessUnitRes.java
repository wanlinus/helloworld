package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Map;

/**
 * @author wanli
 * @date 2019-07-01 12:08
 */
public class NucBusinessUnitRes implements Serializable {

    @JsonProperty("parent_business_unit")
    private String parentBusinessUnit;

    @JsonProperty("business_name")
    private String businessName;

    @JsonProperty("isValid")
    private String isValid;

    @JsonProperty("updateTime")
    private Long updateTime;

    @JsonProperty("business_unit")
    private String businessUnit;

    @JsonProperty("updater")
    private String updater;

    @JsonProperty("createTime")
    private Long createTime;

    @JsonProperty("business_type")
    private String businessType;

    @JsonProperty("objectProp")
    private Map<String, Object> objectProp;

    @JsonProperty("creater")
    private String creater;

    @JsonProperty("id")
    private String id;

    public NucBusinessUnitRes() {
    }

    public NucBusinessUnitRes(String parentBusinessUnit, String businessName, String isValid, Long updateTime, String businessUnit, String updater, Long createTime, String businessType, Map<String, Object> objectProp, String creater, String id) {
        this.parentBusinessUnit = parentBusinessUnit;
        this.businessName = businessName;
        this.isValid = isValid;
        this.updateTime = updateTime;
        this.businessUnit = businessUnit;
        this.updater = updater;
        this.createTime = createTime;
        this.businessType = businessType;
        this.objectProp = objectProp;
        this.creater = creater;
        this.id = id;
    }

    public String getParentBusinessUnit() {
        return parentBusinessUnit;
    }

    public void setParentBusinessUnit(String parentBusinessUnit) {
        this.parentBusinessUnit = parentBusinessUnit;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Map<String, Object> getObjectProp() {
        return objectProp;
    }

    public void setObjectProp(Map<String, Object> objectProp) {
        this.objectProp = objectProp;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
