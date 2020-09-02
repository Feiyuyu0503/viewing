package com.seu.film.pojo;

public class Collection {
    private int userid;
    private int filmid;

    public Collection() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getFilmid() {
        return filmid;
    }

    public void setFilmid(int filmid) {
        this.filmid = filmid;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "userid=" + userid +
                ", filmid=" + filmid +
                '}';
    }
}
