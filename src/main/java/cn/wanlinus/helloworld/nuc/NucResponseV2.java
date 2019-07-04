package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * @author wanli
 * @date 2019-07-01 11:19
 */
public class NucResponseV2<T extends Serializable> implements Serializable {
    private String status;
    private String msg;
    private String recordTotal;
    private T data;

    public NucResponseV2() {
    }

    public NucResponseV2(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRecordTotal() {
        return recordTotal;
    }

    public void setRecordTotal(String recordTotal) {
        this.recordTotal = recordTotal;
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
