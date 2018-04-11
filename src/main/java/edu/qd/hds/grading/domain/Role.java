package edu.qd.hds.grading.domain;

import java.io.Serializable;

public class Role implements Serializable {

    private static final long serialVersionUID = -4686655812601046905L;

    private int id;

    private String name;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
