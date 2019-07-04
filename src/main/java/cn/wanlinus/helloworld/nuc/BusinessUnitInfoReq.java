package cn.wanlinus.helloworld.nuc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author wanli
 * @date 2019-07-03 10:09
 */
public class BusinessUnitInfoReq implements Serializable {
    @JsonProperty("business_unit")
    private String businessUnit;
    @JsonProperty("expansionProp")
    private String expansionProp;

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getExpansionProp() {
        return expansionProp;
    }

    public void setExpansionProp(String expansionProp) {
        this.expansionProp = expansionProp;
    }
}
