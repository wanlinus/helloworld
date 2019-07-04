package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Map;

/**
 * @author wanli
 * @date 2019-07-01 11:59
 */
public class NucOrganizeInfoRes implements Serializable {
    @JsonProperty("objectProp")
    private Map<String, Object> objectProp;

    @JsonProperty("organize_no")
    private String organizeNo;

    @JsonProperty("organize_type")
    private String organizeType;

    @JsonProperty("business_unit")
    private String businessUnit;

    @JsonProperty("organize_name")
    private String organizeName;

    @JsonProperty("parent_organize_no")
    private String parentOrganizeNo;

    @JsonProperty("remarks")
    private String remarks;

    @JsonProperty("manager_posn")
    private String managerPosn;

    @JsonProperty("manager_id")
    private String managerId;

    @JsonProperty("organizeTypeName")
    private String organizeTypeName;

    @JsonProperty("parentOrganizeName")
    private String parentOrganizeName;

    public Map<String, Object> getObjectProp() {
        return objectProp;
    }

    public void setObjectProp(Map<String, Object> objectProp) {
        this.objectProp = objectProp;
    }

    public String getOrganizeNo() {
        return organizeNo;
    }

    public void setOrganizeNo(String organizeNo) {
        this.organizeNo = organizeNo;
    }

    public String getOrganizeType() {
        return organizeType;
    }

    public void setOrganizeType(String organizeType) {
        this.organizeType = organizeType;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getOrganizeName() {
        return organizeName;
    }

    public void setOrganizeName(String organizeName) {
        this.organizeName = organizeName;
    }

    public String getParentOrganizeNo() {
        return parentOrganizeNo;
    }

    public void setParentOrganizeNo(String parentOrganizeNo) {
        this.parentOrganizeNo = parentOrganizeNo;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getManagerPosn() {
        return managerPosn;
    }

    public void setManagerPosn(String managerPosn) {
        this.managerPosn = managerPosn;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getOrganizeTypeName() {
        return organizeTypeName;
    }

    public void setOrganizeTypeName(String organizeTypeName) {
        this.organizeTypeName = organizeTypeName;
    }

    public String getParentOrganizeName() {
        return parentOrganizeName;
    }

    public void setParentOrganizeName(String parentOrganizeName) {
        this.parentOrganizeName = parentOrganizeName;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
