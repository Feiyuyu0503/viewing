package com.seu.film.pojo;

public class Storage {
    private int uid;
    private int fid;

    public Storage(int uid, int fid) {
        this.uid = uid;
        this.fid = fid;
    }

    public Storage() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "uid=" + uid +
                ", fid=" + fid +
                '}';
    }
}
