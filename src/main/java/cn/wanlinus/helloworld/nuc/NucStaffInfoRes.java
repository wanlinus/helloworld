package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.List;

/**
 * @author wanli
 * @date 2019-07-01 11:23
 */
public class NucStaffInfoRes implements Serializable {
    private List<PaasUcOrganizeQuartersStaff> paasUcOrganizeQuartersStaff;
    private PaasUcStaff paasUcStaff;

    public List<PaasUcOrganizeQuartersStaff> getPaasUcOrganizeQuartersStaff() {
        return paasUcOrganizeQuartersStaff;
    }

    public void setPaasUcOrganizeQuartersStaff(List<PaasUcOrganizeQuartersStaff> paasUcOrganizeQuartersStaff) {
        this.paasUcOrganizeQuartersStaff = paasUcOrganizeQuartersStaff;
    }

    public PaasUcStaff getPaasUcStaff() {
        return paasUcStaff;
    }

    public void setPaasUcStaff(PaasUcStaff paasUcStaff) {
        this.paasUcStaff = paasUcStaff;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
