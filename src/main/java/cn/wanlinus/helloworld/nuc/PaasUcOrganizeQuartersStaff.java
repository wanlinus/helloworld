package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wanli
 * @date 2019-07-01 11:24
 */
public class PaasUcOrganizeQuartersStaff implements Serializable {
    @JsonProperty("organize_name")
    private String organizeName;

    @JsonProperty("quarters_desc")
    private String quartersDesc;

    @JsonProperty("empl_rcd")
    private String emplRcd;

    @JsonProperty("empl_id")
    private String emplId;

    @JsonProperty("organize_no")
    private String organizeNo;

    @JsonProperty("effdt")
    private Date effdt;

    @JsonProperty("business_unit")
    private String businessUnit;

    @JsonProperty("quarters_code")
    private String quartersCode;

    @JsonProperty("parent_organize_no")
    private String parentOrganizeNo;

    @JsonProperty("account_id")
    private String accountId;

    @JsonProperty("empl_name")
    private String emplName;

    @JsonProperty("parent_organize_name")
    private String parentOrganizeName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("effseq")
    private String effseq;

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

    public String getEmplRcd() {
        return emplRcd;
    }

    public void setEmplRcd(String emplRcd) {
        this.emplRcd = emplRcd;
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

    public Date getEffdt() {
        return effdt;
    }

    public void setEffdt(Date effdt) {
        this.effdt = effdt;
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

    public String getParentOrganizeName() {
        return parentOrganizeName;
    }

    public void setParentOrganizeName(String parentOrganizeName) {
        this.parentOrganizeName = parentOrganizeName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEffseq() {
        return effseq;
    }

    public void setEffseq(String effseq) {
        this.effseq = effseq;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
