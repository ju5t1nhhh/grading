package edu.qd.hds.grading.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Complaint implements Serializable {

    private static final long serialVersionUID = 2646479035445548113L;

    private long user;

    private long post;

    private int cmtid;

    private String msg;

    private Timestamp creatime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public long getPost() {
        return post;
    }

    public void setPost(long post) {
        this.post = post;
    }

    public int getCmtid() {
        return cmtid;
    }

    public void setCmtid(int cmtid) {
        this.cmtid = cmtid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Timestamp getCreatime() {
        return creatime;
    }

    public void setCreatime(Timestamp creatime) {
        this.creatime = creatime;
    }

}
