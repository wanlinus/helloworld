package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;

/**
 * @author wanli
 * @date 2019-06-27 15:46
 */
public class NucLoginReq {
    private String nucServerHost;
    private String accountId;
    private String password;
    private String verifyCode;
    private NucLoginOptions options;

    public String getNucServerHost() {
        return nucServerHost;
    }

    public void setNucServerHost(String nucServerHost) {
        this.nucServerHost = nucServerHost;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public NucLoginOptions getOptions() {
        return options;
    }

    public void setOptions(NucLoginOptions options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
