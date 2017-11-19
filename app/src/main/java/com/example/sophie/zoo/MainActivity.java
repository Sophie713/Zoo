package com.example.sophie.zoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//create a list of animals
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal(R.drawable.hedgehod_d, "Hedgehog","Toby"));
        animals.add(new Animal(R.drawable.cat, "Cat","Mici"));
        animals.add(new Animal(R.drawable.dog, "Dog","Bone"));
        animals.add(new Animal(R.drawable.panda, "Panda","Sia"));
        animals.add(new Animal(R.drawable.bat, "Bat","Posty"));

//put animals into the view
        AnimalAdapter animalList = new AnimalAdapter(this, animals);
//connect the layout
        ListView animalListView = findViewById(R.id.zoo);
//set the animal view to the list
        animalListView.setAdapter(animalList);

    }
}
