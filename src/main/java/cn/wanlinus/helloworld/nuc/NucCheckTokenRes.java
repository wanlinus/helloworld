package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author wanli
 * @date 2019-07-01 13:52
 */
public class NucCheckTokenRes implements Serializable {

    @JsonProperty("accountId")
    private String accountId;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("businessUnitName")
    private String businessUnitName;

    @JsonProperty("empList")
    private List<NucEmplistItem> empList;

    @JsonProperty("menuList")
    private List<String> menuList;

    @JsonProperty("businessUnit")
    private String businessUnit;

    @JsonProperty("roles")
    private List<String> roles;

    @JsonProperty("name")
    private String name;

    @JsonProperty("buttonList")
    private List<String> buttonList;

    @JsonProperty("acountList")
    private Map<String, Object> acountList;

    @JsonProperty("token")
    private String token;

    @JsonProperty("apiList")
    private List<String> apiList;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getBusinessUnitName() {
        return businessUnitName;
    }

    public void setBusinessUnitName(String businessUnitName) {
        this.businessUnitName = businessUnitName;
    }

    public List<NucEmplistItem> getEmpList() {
        return empList;
    }

    public void setEmpList(List<NucEmplistItem> empList) {
        this.empList = empList;
    }

    public List<String> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<String> menuList) {
        this.menuList = menuList;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getButtonList() {
        return buttonList;
    }

    public void setButtonList(List<String> buttonList) {
        this.buttonList = buttonList;
    }

    public Map<String, Object> getAcountList() {
        return acountList;
    }

    public void setAcountList(Map<String, Object> acountList) {
        this.acountList = acountList;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<String> getApiList() {
        return apiList;
    }

    public void setApiList(List<String> apiList) {
        this.apiList = apiList;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
