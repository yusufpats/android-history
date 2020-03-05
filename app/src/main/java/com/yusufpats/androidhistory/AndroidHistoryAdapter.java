package com.yusufpats.androidhistory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * Adapter class to display the list of android versions
 * <p>
 * 1: Create a xml layout for the list item view
 * 2: Create a ViewHolder using it
 */
public class AndroidHistoryAdapter extends RecyclerView.Adapter<AndroidHistoryAdapter.AndroidHistoryViewHolder> {

    private ArrayList<AndroidVersion> androidVersions;

    public AndroidHistoryAdapter(ArrayList<AndroidVersion> androidVersions) {
        this.androidVersions = androidVersions;
    }

    @NonNull
    @Override
    public AndroidHistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a ViewHolder Object and return

        // 1: Get an object of the LayoutInflater class
        // 2: Use the inflater object to inflate the list item layout into a java `View` object
        // 3: create and return a new object of the ViewHolder class (AndroidHistoryViewHolder) using the View object above

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.layout_android_version_item, parent, false);
        return new AndroidHistoryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AndroidHistoryViewHolder holder, int position) {
        // Bind the data from the arrayList at the `position` to respective ViewHolder

        AndroidVersion androidVersion = androidVersions.get(position);

        holder.androidVersionNameTextView.setText(androidVersion.androidVersionName);
        holder.androidApiTextView.setText("API Level " + androidVersion.androidApiLevel);
    }

    @Override
    public int getItemCount() {
        //Return the count of the array list
        return androidVersions.size();
    }

    /**
     * ViewHolder class representing every `Android Version Item`
     */
    class AndroidHistoryViewHolder extends RecyclerView.ViewHolder {

        TextView androidVersionNameTextView;
        TextView androidApiTextView;

        AndroidHistoryViewHolder(@NonNull View itemView) {
            super(itemView);
            androidVersionNameTextView = itemView.findViewById(R.id.android_version_name);
            androidApiTextView = itemView.findViewById(R.id.android_api);
        }
    }
}
