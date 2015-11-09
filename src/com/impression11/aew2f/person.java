package com.impression11.aew2f;

/**
 * Created by Ethan on 12/10/15.
 */
public class person {

    String firstName;
    String surname;
    String favoriteColor;

    public person(){}

    public person(String firstName, String surname, String favoriteColor) {
        this.firstName = firstName;
        this.surname = surname;
        this.favoriteColor = favoriteColor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
}
