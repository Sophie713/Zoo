package com.example.sophie.zoo;

/**
 * Created by Sophie on 11/18/2017.
 */

public class Animal {
    private int mImgResourceId;
    private String mSpecies;
    private String mName;


    Animal(int imgResourceId, String species, String name){

        mImgResourceId = imgResourceId;
        mSpecies = species;
        mName = name;
    }

    public int getImg() {
        return mImgResourceId;
    }

    public String getAnimalName() {
        return mName;
    }

    public String getSpecies() {
        return mSpecies;
    }
}
