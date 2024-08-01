package com.example.firebaseapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firebaseapp.databinding.ItemCardBinding;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.UserViewHolder> {
    /*
    View Holder cache the references to individual views in the item layout
     */

    private Context context;
    private ArrayList<User> userArrayList;

    public MyAdapter(Context context, ArrayList<User> userArrayList) {
        this.context = context;
        this.userArrayList = userArrayList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate the layout
        ItemCardBinding itemCardBinding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.getContext()), R.layout.item_card, parent, false);
        return new UserViewHolder(itemCardBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        //bind the data to the view holder
        //populates the view holder with the data from the data set
        User user = userArrayList.get(position);
        holder.itemCardBinding.setUser(user);
    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        private ItemCardBinding itemCardBinding;

        public UserViewHolder(ItemCardBinding itemCardBinding) {
            super(itemCardBinding.getRoot());
            this.itemCardBinding = itemCardBinding;
            //Handling click event
            itemCardBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                }
            });
        }
    }
}
