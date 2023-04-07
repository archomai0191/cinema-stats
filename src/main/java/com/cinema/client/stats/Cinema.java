package com.cinema.client.stats;

public class Cinema {
    private String name;
    private String genre;
    private double length;

    public Cinema(String name, String genre, double length) {
        this.name = name;
        this.genre = genre;
        this.length = length;
    }
    @SuppressWarnings("unused")
    public String getName() {
        return name;
    }
    @SuppressWarnings("unused")
    public void setName(String name) {
        this.name = name;
    }
    @SuppressWarnings("unused")
    public String getGenre() {
        return genre;
    }
    @SuppressWarnings("unused")
    public void setGenre(String genre) {
        this.genre = genre;
    }
    @SuppressWarnings("unused")
    public double getLength() {
        return length;
    }
    @SuppressWarnings("unused")
    public void setLength(double length) {
        this.length = length;
    }
}
