package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author wanli
 * @date 2019-07-01 12:18
 */
public class NucBusinessUnitReq implements Serializable {

    @JsonProperty("nuc_id")
    private Long nucId;

    @JsonProperty("business_unit")
    private String businessUnit;

    @JsonProperty("parent_business_unit")
    private String parentBusinessUnit;

    @JsonProperty("business_name")
    private String businessName;

    @JsonProperty("business_type")
    private String businessType;

    @JsonProperty("updateTime")
    private String updateTime;

    @JsonProperty("currentPage")
    private Integer currentPage;

    @JsonProperty("pageSize")
    private Integer pageSize;

    private String nucServerHost;

    public NucBusinessUnitReq() {
    }

    public NucBusinessUnitReq(Integer currentPage, Integer pageSize, String businessUnit) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.businessUnit = businessUnit;
    }

    public Long getNucId() {
        return nucId;
    }

    public void setNucId(Long nucId) {
        this.nucId = nucId;
    }
    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
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

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getNucServerHost() {
        return nucServerHost;
    }

    public void setNucServerHost(String nucServerHost) {
        this.nucServerHost = nucServerHost;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
