package com.example.thinkspeaktrial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserRVAdapter extends RecyclerView.Adapter<UserRVAdapter.ViewHolder> {

    // variable for our array list and context.
    private ArrayList<UserModal> userModalArrayList;
    private Context context;

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
        private TextView tempTV, bedNoTV, oxygenTV, pulseTV;

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
