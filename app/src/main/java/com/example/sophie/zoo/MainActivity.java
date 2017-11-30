package com.example.sophie.zoo;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//create a list of animals
        final ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal(R.drawable.hedgehog_d, "Hedgehog","Toby", R.raw.hedgehog));
        animals.add(new Animal(R.drawable.cat, "Cat","Mici", R.raw.cat));
        animals.add(new Animal(R.drawable.dog, "Dog","Bone", R.raw.dog));
        animals.add(new Animal(R.drawable.panda, "Panda","Sia", R.raw.panda));
        animals.add(new Animal(R.drawable.bat, "Bat","Posty", R.raw.bat));

//put animals into the view
        AnimalAdapter animalList = new AnimalAdapter(this, animals);
//connect the layout
        ListView animalListView = findViewById(R.id.zoo);
//set the animal view to the list
        animalListView.setAdapter(animalList);

        animalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Animal animal = animals.get(position);
                mPlayer = MediaPlayer.create(MainActivity.this, animal.getSound())
                ;
                mPlayer.start();
            }
        });

    }

}
