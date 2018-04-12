package edu.qd.hds.grading.domain;

import java.io.Serializable;

public class Likes implements Serializable {

    private static final long serialVersionUID = -4533204935550908650L;

    private long post;

    private int cmtid;

    private long liker;

    public Likes() {
    }

    public Likes(long post, int cmtid, long liker) {
        this.post = post;
        this.cmtid = cmtid;
        this.liker = liker;
    }

    @Override
    public String toString() {
        return "Likes{" +
                "post=" + post +
                ", cmtid=" + cmtid +
                ", liker=" + liker +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public long getLiker() {
        return liker;
    }

    public void setLiker(long liker) {
        this.liker = liker;
    }

}
