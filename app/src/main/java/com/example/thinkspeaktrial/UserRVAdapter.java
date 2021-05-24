package com.example.thinkspeaktrial;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserRVAdapter extends RecyclerView.Adapter<UserRVAdapter.ViewHolder> {

    // variable for our array list and context.
    private final ArrayList<UserModal> userModalArrayList;
    private final Context context;

    // creating a constructor.
    public UserRVAdapter(ArrayList<UserModal> userModalArrayList, Context context) {
        this.userModalArrayList = userModalArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflating our layout file on below line.
        View view = LayoutInflater.from(context).inflate(R.layout.user_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        // getting data from our array list in our modal class.
        UserModal userModal = userModalArrayList.get(position);

        // on the below line we are setting data to our text view.
        holder.bedNoTV.setText(userModal.getBedNo());
        holder.oxygenTV.setText(userModal.getOxygen());
        holder.tempTV.setText(userModal.getTemp());
        holder.pulseTV.setText(userModal.getPulseRate());

        if (Integer.parseInt(userModal.getOxygen()) < 90) {
            holder.oxygenTV.setTextColor(Color.parseColor("#FF0000"));
        } else {
            holder.oxygenTV.setTextColor(Color.parseColor("#008000"));
        }
        if (Integer.parseInt(userModal.getTemp()) > 37) {
            holder.tempTV.setTextColor(Color.parseColor("#FF0000"));
        } else {
            holder.tempTV.setTextColor(Color.parseColor("#008000"));
        }
        if (Integer.parseInt(userModal.getPulseRate()) <= 60 || Integer.parseInt(userModal.getPulseRate()) >= 100) {
            holder.pulseTV.setTextColor(Color.parseColor("#FF0000"));
        } else {
            holder.pulseTV.setTextColor(Color.parseColor("#008000"));
        }

        // on below line we are loading our image from the URL
        // in our image view using Picasso.
    }

    @Override
    public int getItemCount() {
        // returning the size of array list.
        return userModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // creating a variable for our text view and image view.
        private final TextView tempTV;
        private final TextView bedNoTV;
        private final TextView oxygenTV;
        private final TextView pulseTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // initializing our variables.

            tempTV = itemView.findViewById(R.id.idTVTemp);
            bedNoTV = itemView.findViewById(R.id.idTVBedNo);
            oxygenTV = itemView.findViewById(R.id.idTVOxygen);
            pulseTV = itemView.findViewById(R.id.idTVPulseRate);
        }
    }
}
