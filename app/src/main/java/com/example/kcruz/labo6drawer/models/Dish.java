package com.example.kcruz.labo6drawer.models;

public class RestaurantMenu {
    private String type; //breakfast, lunch, dinner
    private int photo;
    private String dish;
    private String description;

    public RestaurantMenu() {
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
