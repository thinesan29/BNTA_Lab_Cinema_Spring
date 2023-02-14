package com.btna.cinema.models;

import jakarta.persistence.*;

@Entity(name = "movies")

public class Movie {
    @Id //Primary Key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Flag as Using Serial Type, Automated Generated.
    private int id;

    // Properties

    @Column(name = "title")
    private String title;

    @Column(name = "rating")
    private double rating;

    @Column(name = "duration")
    private int duration;

    // Parameterised Constructor
    public Movie(int id, String title, double rating, int duration) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }

    // Default Constructor
    public Movie(){
    }


    // Getter & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
