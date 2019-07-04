package cn.wanlinus.helloworld.nuc;

import java.io.Serializable;
import java.util.List;

public class StaffInfo implements Serializable {
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
        return "StaffInfo{" +
                "paasUcOrganizeQuartersStaff=" + paasUcOrganizeQuartersStaff +
                ", paasUcStaff=" + paasUcStaff +
                '}';
    }
}
