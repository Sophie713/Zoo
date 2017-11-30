package com.example.sophie.zoo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//Animal Adapter

public class AnimalAdapter extends ArrayAdapter {

    AnimalAdapter(Context context, ArrayList<Animal> animals) {
        super(context, R.layout.animal_list, animals);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater sophiesInflater = LayoutInflater.from(getContext());
        View customView = sophiesInflater.inflate(R.layout.animal_list, parent, false);

        Animal currentAnimal = (Animal) getItem(position);


        ImageView mAnimalPicture = customView.findViewById(R.id.animal_photo);
        TextView mSpecies = customView.findViewById(R.id.species);
        TextView mName = customView.findViewById(R.id.name);

        mSpecies.setText(currentAnimal.getSpecies());
        mName.setText(currentAnimal.getAnimalName());
        mAnimalPicture.setImageResource(currentAnimal.getImg());

        return customView;
    }
}
