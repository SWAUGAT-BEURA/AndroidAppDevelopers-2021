package com.android.internshipprogram.HelperClasses.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.internshipprogram.R;

import java.util.ArrayList;

public  class CentralRecyclerAdapter extends RecyclerView.Adapter<CentralRecyclerAdapter.CentralRecyclerViewHolder>{
    ArrayList<CentralRecyclerHelper> centralRecyclerHelpers;

    public CentralRecyclerAdapter(ArrayList<CentralRecyclerHelper> centralRecyclerHelpers) {
        this.centralRecyclerHelpers = centralRecyclerHelpers;
    }

    @NonNull
    @Override
    public CentralRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.central_card_design,parent,false);
        CentralRecyclerViewHolder centralRecyclerViewHolder=new CentralRecyclerViewHolder(view);

        return centralRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CentralRecyclerViewHolder holder, int position) {
        CentralRecyclerHelper centralRecyclerHelper=centralRecyclerHelpers.get(position);
        holder.image.setImageResource(centralRecyclerHelper.getImage());
        holder.heading.setText(centralRecyclerHelper.getHeading());
        holder.description.setText(centralRecyclerHelper.getDescription());
    }

    @Override
    public int getItemCount() {
        return centralRecyclerHelpers.size();
    }

    public static class CentralRecyclerViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView heading,description;

        public CentralRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.CentralImage);
            heading=itemView.findViewById(R.id.heading);
            description=itemView.findViewById(R.id.description);
        }
    }
}