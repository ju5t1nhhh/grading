package edu.qd.hds.grading.domain;

import java.io.Serializable;

public class Score implements Serializable {

    private static final long serialVersionUID = 820918109912691000L;

    private long user;

    private long post;

    private int score;

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
