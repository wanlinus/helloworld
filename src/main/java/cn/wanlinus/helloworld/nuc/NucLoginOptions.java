package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;

/**
 * @author wanli
 * @date 2019-06-29 18:00
 */
public class NucLoginOptions {
    private String encodePasswd;
    private String moduleCode;
    private String imageUUID;

    public String getEncodePasswd() {
        return encodePasswd;
    }

    public void setEncodePasswd(String encodePasswd) {
        this.encodePasswd = encodePasswd;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getImageUUID() {
        return imageUUID;
    }

    public void setImageUUID(String imageUUID) {
        this.imageUUID = imageUUID;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
