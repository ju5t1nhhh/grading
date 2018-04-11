package edu.qd.hds.grading.domain;

import java.io.Serializable;

public class Admin implements Serializable {

    private static final long serialVersionUID = -5930623744900066729L;

    private String loginId;

    private String pwd;

    private int role;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

}
