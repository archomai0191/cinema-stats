package com.cinema.client.stats;

public class Viewer {
    private String name;
    private int age;
    private int filmCount;

    public Viewer(String name, int age, int filmCount) {
        this.name = name;
        this.age = age;
        this.filmCount = filmCount;
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
        return filmCount;
    }
    @SuppressWarnings("unused")
    public void setFilmCount(int filmCount) {
        this.filmCount = filmCount;
    }

}
