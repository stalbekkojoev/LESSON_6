package com.example.lesson_6;

public class Model {
    private Integer image;
    private String name;
    private Integer id;

    public Model(Integer image, String name) {
        this.image = image;
        this.name = name;
    }

    public Model(Integer image, String name, Integer id) {
        this.image = image;
        this.name = name;
        this.id = id;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
