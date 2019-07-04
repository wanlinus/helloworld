package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author wanli
 * @date 2019-07-01 13:26
 */
public class NucStaffOrganize implements Serializable {
    @JsonProperty("business_name")
    private String businessName;

    @JsonProperty("organize_name")
    private String organizeName;

    @JsonProperty("quarters_desc")
    private String quartersDesc;

    @JsonProperty("empl_id")
    private String emplId;

    @JsonProperty("organize_no")
    private String organizeNo;

    @JsonProperty("business_unit")
    private String businessUnit;

    @JsonProperty("quarters_code")
    private String quartersCode;

    @JsonProperty("parent_organize_no")
    private String parentOrganizeNo;

    @JsonProperty("organize_type")
    private String organizeType;

    public NucStaffOrganize() {
    }

    public NucStaffOrganize(String businessName, String organizeName, String quartersDesc, String emplId, String organizeNo, String businessUnit, String quartersCode, String parentOrganizeNo, String organizeType) {
        this.businessName = businessName;
        this.organizeName = organizeName;
        this.quartersDesc = quartersDesc;
        this.emplId = emplId;
        this.organizeNo = organizeNo;
        this.businessUnit = businessUnit;
        this.quartersCode = quartersCode;
        this.parentOrganizeNo = parentOrganizeNo;
        this.organizeType = organizeType;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getOrganizeName() {
        return organizeName;
    }

    public void setOrganizeName(String organizeName) {
        this.organizeName = organizeName;
    }

    public String getQuartersDesc() {
        return quartersDesc;
    }

    public void setQuartersDesc(String quartersDesc) {
        this.quartersDesc = quartersDesc;
    }

    public String getEmplId() {
        return emplId;
    }

    public void setEmplId(String emplId) {
        this.emplId = emplId;
    }

    public String getOrganizeNo() {
        return organizeNo;
    }

    public void setOrganizeNo(String organizeNo) {
        this.organizeNo = organizeNo;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getQuartersCode() {
        return quartersCode;
    }

    public void setQuartersCode(String quartersCode) {
        this.quartersCode = quartersCode;
    }

    public String getParentOrganizeNo() {
        return parentOrganizeNo;
    }

    public void setParentOrganizeNo(String parentOrganizeNo) {
        this.parentOrganizeNo = parentOrganizeNo;
    }

    public String getOrganizeType() {
        return organizeType;
    }

    public void setOrganizeType(String organizeType) {
        this.organizeType = organizeType;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
