package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author wanli
 * @date 2019-06-27 16:17
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NucLoginRes implements Serializable {
    @JsonProperty("birthday")
    private Date birthday;

    @JsonProperty("accountId")
    private String accountId;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("identityImprove")
    private String identityImprove;

    @JsonProperty("sex")
    private String sex;

    @JsonProperty("name")
    private String name;

    @JsonProperty("accessToken")
    private String accessToken;

    @JsonProperty("cmToken")
    private String cmToken;

    @JsonProperty("type")
    private String type;

    @JsonProperty("refreshToken")
    private String refreshToken;

    @JsonProperty("ssoRefreshToken")
    private String ssoRefreshToken;

    @JsonProperty("ssoCookies")
    private List<SsoCookie> ssoCookies;

    @JsonProperty("imageCodeVerifyRequired")
    private Boolean imageCodeVerifyRequired;

    @JsonProperty("errorTimes")

    private Integer errorTimes;
    public NucLoginRes() {
    }

    public NucLoginRes(String accountId, String name, String accessToken) {
        this.accountId = accountId;
        this.name = name;
        this.accessToken = accessToken;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

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

    public String getIdentityImprove() {
        return identityImprove;
    }

    public void setIdentityImprove(String identityImprove) {
        this.identityImprove = identityImprove;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getCmToken() {
        return cmToken;
    }

    public void setCmToken(String cmToken) {
        this.cmToken = cmToken;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getSsoRefreshToken() {
        return ssoRefreshToken;
    }

    public void setSsoRefreshToken(String ssoRefreshToken) {
        this.ssoRefreshToken = ssoRefreshToken;
    }

    public List<SsoCookie> getSsoCookies() {
        return ssoCookies;
    }

    public void setSsoCookies(List<SsoCookie> ssoCookies) {
        this.ssoCookies = ssoCookies;
    }

    public Boolean getImageCodeVerifyRequired() {
        return imageCodeVerifyRequired;
    }

    public void setImageCodeVerifyRequired(Boolean imageCodeVerifyRequired) {
        this.imageCodeVerifyRequired = imageCodeVerifyRequired;
    }

    public Integer getErrorTimes() {
        return errorTimes;
    }

    public void setErrorTimes(Integer errorTimes) {
        this.errorTimes = errorTimes;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
