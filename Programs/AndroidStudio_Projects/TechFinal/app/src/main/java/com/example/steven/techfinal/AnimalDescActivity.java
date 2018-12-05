package com.example.steven.techfinal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalDescActivity extends AppCompatActivity {
    private ImageView mAnimalDescpicture;
    private TextView mAnimalName;
    private TextView mAnimalDesc;

    public static Intent newIntent(Context packageContext) {
        Intent intent = new Intent(packageContext, AnimalDescActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_desc);
        mAnimalDescpicture = findViewById(R.id.animal_desc_picture);
        mAnimalDesc = findViewById(R.id.animal_desc);
        mAnimalName = findViewById(R.id.animal_desc_name);
        Intent intent = getIntent();
        int picId = intent.getExtras().getInt("id");
        if (picId == 0) {
            mAnimalDescpicture.setImageResource(R.drawable.dog1);
            mAnimalName.setText("dog1");
            mAnimalDesc.setText("this is dog1");
        } else if (picId == 1) {
            mAnimalDescpicture.setImageResource(R.drawable.dog2);
            mAnimalName.setText("dog2");
            mAnimalDesc.setText("this is dog2");
        } else if (picId == 2) {
            mAnimalDescpicture.setImageResource(R.drawable.dog3);
            mAnimalName.setText("dog3");
            mAnimalDesc.setText("this is dog3");
        } else if (picId == 3) {
            mAnimalDescpicture.setImageResource(R.drawable.dog4);
            mAnimalName.setText("dog4");
            mAnimalDesc.setText("this is dog4");
        } else if (picId == 4) {
            mAnimalDescpicture.setImageResource(R.drawable.dog5);
            mAnimalName.setText("dog5");
            mAnimalDesc.setText("this is dog5");
        } else if (picId == 5) {
            mAnimalDescpicture.setImageResource(R.drawable.cat1);
            mAnimalName.setText("cat1");
            mAnimalDesc.setText("this is cat1");
        } else if (picId == 6) {
            mAnimalDescpicture.setImageResource(R.drawable.cat2);
            mAnimalName.setText("cat2");
            mAnimalDesc.setText("this is cat2");
        } else if (picId == 7) {
            mAnimalDescpicture.setImageResource(R.drawable.cat3);
            mAnimalName.setText("cat3");
            mAnimalDesc.setText("this is cat3");
        } else if (picId == 8) {
            mAnimalDescpicture.setImageResource(R.drawable.cat4);
            mAnimalName.setText("cat4");
            mAnimalDesc.setText("this is cat4");
        } else if (picId == 9) {
            mAnimalDescpicture.setImageResource(R.drawable.cat5);
            mAnimalName.setText("cat5");
            mAnimalDesc.setText("this is cat5");
        }
    }
}
