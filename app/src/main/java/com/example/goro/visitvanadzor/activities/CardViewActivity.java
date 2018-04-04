package com.example.goro.visitvanadzor.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.goro.visitvanadzor.R;

public class CardViewActivity extends AppCompatActivity {

    TextView personName;
    TextView personAge;
    ImageView personPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_card_view);
        personName = (TextView)findViewById(R.id.person_name);
//        personAge = (TextView)findViewById(R.id.person_age);
        personPhoto = (ImageView)findViewById(R.id.person_photo);

        personName.setText("Emma Wilson");
        personAge.setText("23 years old");
        personPhoto.setImageResource(R.drawable.amenorya);
    }
}
