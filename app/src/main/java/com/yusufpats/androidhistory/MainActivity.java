package com.yusufpats.androidhistory;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // STEP-1: View objects
    private RecyclerView historyRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // STEP-1: Bind the recycler view element to java object
        historyRecyclerView = findViewById(R.id.history_recycler_view);

        // STEP-2: Create a LayoutManager and attach it to the recycler view object
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        historyRecyclerView.setLayoutManager(layoutManager);

        // STEP-3: Create data list
        ArrayList<AndroidVersion> androidVersions = getAndroidVersions();

        // STEP-4: Create an object of the RecyclerView.Adapter class and attach it to the recycler view
        AndroidHistoryAdapter adapter = new AndroidHistoryAdapter(androidVersions);
        historyRecyclerView.setAdapter(adapter);
    }

    private ArrayList<AndroidVersion> getAndroidVersions() {
        ArrayList<AndroidVersion> androidVersions = new ArrayList<>();
        androidVersions.add(new AndroidVersion("(no codename)", 1));
        androidVersions.add(new AndroidVersion("(no codename)", 2));
        androidVersions.add(new AndroidVersion("Android Cupcake", 3));
        androidVersions.add(new AndroidVersion("Android Donut", 4));
        androidVersions.add(new AndroidVersion("Android Eclair", 5));
        androidVersions.add(new AndroidVersion("Android Froyo", 8));
        androidVersions.add(new AndroidVersion("Android Gingerbread", 9));
        androidVersions.add(new AndroidVersion("Android Honeycomb", 11));
        androidVersions.add(new AndroidVersion("Android Ice-cream Sandwich", 14));
        androidVersions.add(new AndroidVersion("Android Jelly Bean", 16));
        androidVersions.add(new AndroidVersion("Android Kitkat", 19));
        androidVersions.add(new AndroidVersion("Android Lollipop", 21));
        androidVersions.add(new AndroidVersion("Android Marshmallow", 23));
        androidVersions.add(new AndroidVersion("Android Nougat", 24));
        androidVersions.add(new AndroidVersion("Android Oreo", 26));
        androidVersions.add(new AndroidVersion("Android Pie", 28));
        androidVersions.add(new AndroidVersion("Android 10", 29));

        return androidVersions;
    }
}
