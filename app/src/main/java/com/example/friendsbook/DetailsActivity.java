package com.example.friendsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView;
    TextView nameText, jobText, characteristicText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = findViewById(R.id.imageView);
        nameText = findViewById(R.id.nameText);
        jobText = findViewById(R.id.jobText);
        characteristicText = findViewById(R.id.characteristicText);

        Intent intent = getIntent();
        Friends selectedFriend = (Friends) intent.getSerializableExtra("selectedFriend");

        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), selectedFriend.getPictureId());
        imageView.setImageBitmap(bitmap);

        nameText.setText(selectedFriend.getName());
        jobText.setText(selectedFriend.getJob());
        characteristicText.setText(selectedFriend.getCharacteristic());





    }
}