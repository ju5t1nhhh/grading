package edu.qd.hds.grading.domain;

import java.io.Serializable;

public class Follow implements Serializable {

    private static final long serialVersionUID = -4306028356101363165L;

    private long user;

    private long foruser;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public long getForuser() {
        return foruser;
    }

    public void setForuser(long foruser) {
        this.foruser = foruser;
    }

}
