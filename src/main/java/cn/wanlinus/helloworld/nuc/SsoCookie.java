package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author wanli
 * @date 2019-06-29 16:09
 */
public class SsoCookie implements Serializable {
    @JsonProperty("name")
    private String name;

    @JsonProperty("value")
    private String value;
    /**
     * 没告诉类型
     */
    @JsonProperty("domain")
    private String domain;

    @JsonProperty("maxAge")
    private Long maxAge;

    @JsonProperty("path")
    private String path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Long getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
