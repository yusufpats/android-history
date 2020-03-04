package com.yusufpats.androidhistory;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    // STEP-1: View objects
    private RecyclerView historyRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // STEP-1: Bind the recycler view element to java object
        historyRecyclerView = findViewById(R.id.history_recycler_view);

        // TODO: STEP-2: Create a LayoutManager and attach it to the recycler view object

        // TODO: STEP-3: Create an object of the RecyclerView.Adapter class and attach it to the recycler view

    }
}
