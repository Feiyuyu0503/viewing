package com.seu.film.pojo;

public class Film {
    private int id;
    private String name;
    private int length;
    private String director;
    private String actors;
    private String date;
    private String image;
    private String type;
    private String introduce;
    private String src;

    public Film(int id, String name, int length, String director, String actors, String date, String image, String type, String introduce, String src) {
        this.id = id;
        this.name = name;
        this.length = length;
        this.director = director;
        this.actors = actors;
        this.date = date;
        this.image = image;
        this.type = type;
        this.introduce = introduce;
        this.src = src;
    }

    public Film() {
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", length=" + length +
                ", director='" + director + '\'' +
                ", actors='" + actors + '\'' +
                ", date='" + date + '\'' +
                ", image='" + image + '\'' +
                ", type='" + type + '\'' +
                ", introduce='" + introduce + '\'' +
                ", src='" + src + '\'' +
                '}';
    }
}
