package com.example.in0418gq.hellolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView =(ListView) findViewById(R.id.simple_list);

        ArrayList<String> androidVersions = new ArrayList<String>();
        androidVersions.add("jellybean");
        androidVersions.add("ice cream");
        androidVersions.add("kitkat");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.list_item,R.id.list_item_text,androidVersions);

        listView.setAdapter(arrayAdapter);

        androidVersions.add("Marshmallow");
        androidVersions.add(0,"lollypop");
        arrayAdapter.notifyDataSetChanged();
    }
}
