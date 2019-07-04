package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Map;

/**
 * @author wanli
 * @date 2019-07-01 11:52
 */
public class NucBusinessUnitInfoRes implements Serializable {
    @JsonProperty("objectProp")
    private Map<String, Object> objectProp;

    @JsonProperty("parent_business_unit")
    private String parentBusinessUnit;

    @JsonProperty("business_name")
    private String businessName;

    @JsonProperty("business_unit")
    private String businessUnit;

    @JsonProperty("parent_business_name")
    private String parentBusinessName;

    @JsonProperty("business_type")
    private String businessType;

    public NucBusinessUnitInfoRes() {
    }

    public NucBusinessUnitInfoRes(Map<String, Object> objectProp, String parentBusinessUnit, String businessName, String businessUnit, String parentBusinessName, String businessType) {
        this.objectProp = objectProp;
        this.parentBusinessUnit = parentBusinessUnit;
        this.businessName = businessName;
        this.businessUnit = businessUnit;
        this.parentBusinessName = parentBusinessName;
        this.businessType = businessType;
    }

    public Map<String, Object> getObjectProp() {
        return objectProp;
    }

    public void setObjectProp(Map<String, Object> objectProp) {
        this.objectProp = objectProp;
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

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getParentBusinessName() {
        return parentBusinessName;
    }

    public void setParentBusinessName(String parentBusinessName) {
        this.parentBusinessName = parentBusinessName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
