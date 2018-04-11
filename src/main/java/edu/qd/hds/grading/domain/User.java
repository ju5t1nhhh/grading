package edu.qd.hds.grading.domain;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 6348655815966846914L;

    private long autoid;

    private String id;

    private String email;

    private int status;

    private String pwd;

    private int gins;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getAutoid() {
        return autoid;
    }

    public void setAutoid(long autoid) {
        this.autoid = autoid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getGins() {
        return gins;
    }

    public void setGins(int gins) {
        this.gins = gins;
    }

}
