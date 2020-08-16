package com.example.friendsbook;

import android.app.Activity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Friends> {

    private ArrayList<Friends> friends;
    private Activity context;

    public CustomAdapter(ArrayList<Friends> friends, Activity context){
        super(context, R.layout.custom_view, friends);
        this.context = context;
        this.friends = friends;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View customView = layoutInflater.inflate(R.layout.custom_view, null, true);  //custom_view.xml i degiskene atayabildik

        TextView nameView = customView.findViewById(R.id.customTextView);
        nameView.setText(friends.get(position).getName());

        return customView;
    }
}
