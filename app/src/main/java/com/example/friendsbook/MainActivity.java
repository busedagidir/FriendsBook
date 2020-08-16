package com.example.friendsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        Friends monica = new Friends("Monica","Chef","Cleaning obsesive", R.drawable.monica);
        Friends chandler = new Friends("Chandler", "Banker","Joker", R.drawable.chandler);
        Friends rachel = new Friends("Rachel","Fashion Designer","Shopping",R.drawable.rachel);
        Friends ross = new Friends("Ross","Paleontologist","U-na-gi!", R.drawable.ross);
        Friends phoebe = new Friends("Phoebe","Massager","Singing", R.drawable.phoebe);
        Friends joey = new Friends("Joey","Actor","Flirting", R.drawable.joey);

        final ArrayList<Friends> friendsList = new ArrayList<>();
        friendsList.add(monica);
        friendsList.add(chandler);
        friendsList.add(rachel);
        friendsList.add(ross);
        friendsList.add(phoebe);
        friendsList.add(joey);

        CustomAdapter customAdapter = new CustomAdapter(friendsList, MainActivity.this);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("selectedFriend", friendsList.get(i));
                startActivity(intent);

            }
        });
    }
}