package edu.qd.hds.grading.domain;

import java.io.Serializable;

public class Favorite implements Serializable {

    private static final long serialVersionUID = -121255073942177591L;

    private long user;

    private long post;

    public Favorite() {
    }

    public Favorite(long user, long post) {
        this.user = user;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "user=" + user +
                ", post=" + post +
                '}';
    }

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
