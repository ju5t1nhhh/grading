package edu.qd.hds.grading.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Payment implements Serializable {

    private static final long serialVersionUID = -375889641935133578L;

    private String code;

    private long user;

    private int status;

    private String wechat;

    private Timestamp creatime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public Timestamp getCreatime() {
        return creatime;
    }

    public void setCreatime(Timestamp creatime) {
        this.creatime = creatime;
    }

}
