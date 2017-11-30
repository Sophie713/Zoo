package com.example.sophie.zoo;

/**
 * Created by Sophie on 11/18/2017.
 */

public class Animal {
    private int mImgResourceId;
    private String mSpecies;
    private String mName;
    private int mSound;


    Animal(int imgResourceId, String species, String name, int sound){

        mImgResourceId = imgResourceId;
        mSpecies = species;
        mName = name;
        mSound = sound;
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

    public int getSound() {
        return mSound;
    }
}
