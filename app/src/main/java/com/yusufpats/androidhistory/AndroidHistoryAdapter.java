package com.yusufpats.androidhistory;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


/**
 * Adapter class to display the list of android versions
 * 
 * 1: Create a xml layout for the list item view
 * 2: Create a ViewHolder using it
 */
public class AndroidHistoryAdapter extends RecyclerView.Adapter<AndroidHistoryAdapter.AndroidHistoryViewHolder> {

    @NonNull
    @Override
    public AndroidHistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // TODO: Create a ViewHolder Object and return
        // TODO: 1: Get an object of the LayoutInflater class
        // TODO: 2: Use the inflater object to inflate the list item layout into a java `View` object
        // TODO: 3: create and return a new object of the ViewHolder class (AndroidHistoryViewHolder) using the View object above
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AndroidHistoryViewHolder holder, int position) {
        // TODO: Bind the data from the arrayList at the `position` to respective ViewHolder
    }

    @Override
    public int getItemCount() {
        //TODO: Return the count of the array list
        return 0;
    }

    /**
     * ViewHolder class representing every `Android Version Item`
     */
    public class AndroidHistoryViewHolder extends RecyclerView.ViewHolder {
        public AndroidHistoryViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
