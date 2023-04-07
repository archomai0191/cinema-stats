package com.cinema.client.stats;

import java.util.ArrayList;
import java.util.List;

public class Viewer {
    private String name;
    private int age;
    private final List<Cinema> watched;
    public Viewer(String name, int age) {
        this.name = name;
        this.age = age;
        watched = new ArrayList<>();
    }
    @SuppressWarnings("unused")
    public List<Cinema> getWatched() {
        return watched;
    }
    @SuppressWarnings("unused")
   public void setName(String name) {
        this.name = name;
    }
    @SuppressWarnings("unused")
    public String getName() {
        return name;
    }
    @SuppressWarnings("unused")
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @SuppressWarnings("unused")
    public int getFilmCount() {
        return watched.size();
    }
}
