package cn.wanlinus.helloworld.nuc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Staff {
    @JsonProperty("business_unit")
    private String businessUnit;
    @JsonProperty("account_id")
    private String accountId;
    private Boolean expansionProp;

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Boolean getExpansionProp() {
        return expansionProp;
    }

    public void setExpansionProp(Boolean expansionProp) {
        this.expansionProp = expansionProp;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "businessUnit='" + businessUnit + '\'' +
                ", accountId='" + accountId + '\'' +
                ", expansionProp=" + expansionProp +
                '}';
    }
}
