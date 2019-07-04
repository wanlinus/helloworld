package cn.wanlinus.helloworld.nuc;

/**
 * @author wanli
 * @date 2019-07-01 16:51
 */
public class VerifyCodeImageRes {
    private byte[] image;
    private String uuid;

    public VerifyCodeImageRes() {
    }

    public VerifyCodeImageRes(byte[] image, String uuid) {
        this.image = image;
        this.uuid = uuid;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
