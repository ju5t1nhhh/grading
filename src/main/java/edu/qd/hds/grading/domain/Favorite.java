package edu.qd.hds.grading.domain;

import java.io.Serializable;

public class Favorite implements Serializable {

    private static final long serialVersionUID = -121255073942177591L;

    private long user;

    private long post;

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

}
