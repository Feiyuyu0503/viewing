package com.seu.film.pojo;

public class History {
    private int id;
    private int filmid;
    private int userid;
    private String date;
/**
    private Film film;

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
**/
    public History(int id, int filmid, int userid, String date) {
        this.id = id;
        this.filmid = filmid;
        this.userid = userid;
        this.date = date;
    }


    public History() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilmid() {
        return filmid;
    }

    public void setFilmid(int filmid) {
        this.filmid = filmid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", filmid=" + filmid +
                ", userid=" + userid +
                ", date='" + date + '\'' +
                '}';
    }
}
