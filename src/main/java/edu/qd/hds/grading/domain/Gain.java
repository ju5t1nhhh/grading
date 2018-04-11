package edu.qd.hds.grading.domain;

import java.io.Serializable;

public class Gain implements Serializable {

    private static final long serialVersionUID = 2504067100242862430L;

    private long post;

    private long giver;

    private int gins;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getPost() {
        return post;
    }

    public void setPost(long post) {
        this.post = post;
    }

    public long getGiver() {
        return giver;
    }

    public void setGiver(long giver) {
        this.giver = giver;
    }

    public int getGins() {
        return gins;
    }

    public void setGins(int gins) {
        this.gins = gins;
    }

}
