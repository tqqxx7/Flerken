package com.example.admin.flerken.Model;

/**
 * Created by admin on 3/11/2019.
 */

public class Model {
    private String title;
    private int id;

    public Model(){

    }

    public Model(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
