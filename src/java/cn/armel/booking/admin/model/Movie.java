/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cn.armel.booking.admin.model;

/**
 *
 * @author armelmunyaneza
 */
public class Movie {
    private int id;
    private String name;
    private String datereleased;
    private String director;
    private String trailerlink;
    private String description;
    private int category;

    public Movie() {
    }

    public Movie(int id, String name, String datereleased, String director, String trailerlink, String description, int category) {
        this.id = id;
        this.name = name;
        this.datereleased = datereleased;
        this.director = director;
        this.trailerlink = trailerlink;
        this.description = description;
        this.category = category;
    }

    public Movie(String name, String datereleased, String director, String trailerlink, String description, int category) {
        this.name = name;
        this.datereleased = datereleased;
        this.director = director;
        this.trailerlink = trailerlink;
        this.description = description;
        this.category = category;
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

    public String getDatereleased() {
        return datereleased;
    }

    public void setDatereleased(String datereleased) {
        this.datereleased = datereleased;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTrailerlink() {
        return trailerlink;
    }

    public void setTrailerlink(String trailerlink) {
        this.trailerlink = trailerlink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", name=" + name + ", datereleased=" + datereleased + ", director=" + director + ", trailerlink=" + trailerlink + ", description=" + description + ", category=" + category + '}';
    }
    
}

