package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * @author wanli
 * @date 2019-06-27 16:03
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NucResponse<T extends Serializable> implements Serializable {
    private Boolean state;
    private Boolean refresh;
    private String topologys;
    private String message;
    private T data;

    public NucResponse() {
    }

    public NucResponse(Boolean state, String message) {
        this.state = state;
        this.message = message;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getRefresh() {
        return refresh;
    }

    public void setRefresh(Boolean refresh) {
        this.refresh = refresh;
    }

    public String getTopologys() {
        return topologys;
    }

    public void setTopologys(String topologys) {
        this.topologys = topologys;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
