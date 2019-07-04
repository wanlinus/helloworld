package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;

public class NucImportReq {
    private String businessUnit;
    private Boolean expansionProp;
    private String nucServerHost;

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public Boolean getExpansionProp() {
        return expansionProp;
    }

    public void setExpansionProp(Boolean expansionProp) {
        this.expansionProp = expansionProp;
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
