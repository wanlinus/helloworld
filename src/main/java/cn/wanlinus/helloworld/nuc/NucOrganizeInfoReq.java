package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author wanli
 * @date 2019-07-01 13:38
 */
public class NucOrganizeInfoReq implements Serializable {

    @JsonProperty("nuc_id")
    private Long nucId;

    @JsonProperty("business_unit")
    private String businessUnit;

    @JsonProperty("organize_no")
    private String organizeNo;

    @JsonProperty("expansionProp")
    private Boolean expansionProp;

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getOrganizeNo() {
        return organizeNo;
    }

    public void setOrganizeNo(String organizeNo) {
        this.organizeNo = organizeNo;
    }

    public Boolean getExpansionProp() {
        return expansionProp;
    }

    public void setExpansionProp(Boolean expansionProp) {
        this.expansionProp = expansionProp;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
