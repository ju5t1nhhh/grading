package edu.qd.hds.grading.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Message implements Serializable {

    private static final long serialVersionUID = 6441058961144449124L;

    private long rcvder;

    private long senderid;

    private String text;

    private int status;

    private Timestamp creatime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getRcvder() {
        return rcvder;
    }

    public void setRcvder(long rcvder) {
        this.rcvder = rcvder;
    }

    public long getSenderid() {
        return senderid;
    }

    public void setSenderid(long senderid) {
        this.senderid = senderid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getCreatime() {
        return creatime;
    }

    public void setCreatime(Timestamp creatime) {
        this.creatime = creatime;
    }

}
