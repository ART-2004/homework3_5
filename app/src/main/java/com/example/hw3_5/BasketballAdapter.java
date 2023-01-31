package com.example.hw3_5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw3_5.databinding.ItemBascetballClubBinding;
import com.example.hw3_5.databinding.ItemBascetballClubBinding;

import java.util.ArrayList;

public class BasketballAdapter extends RecyclerView.Adapter<BasketballViewHolder>{

    ArrayList<BasketballClub> arrayList;
    OnItemClick onItemClick;

    public BasketballAdapter(ArrayList<BasketballClub> arrayList, OnItemClick onItemClick) {
        this.arrayList = arrayList;
        this.onItemClick = onItemClick;

    }

    @NonNull
    @Override
    public BasketballViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BasketballViewHolder(ItemBascetballClubBinding.inflate
                (LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BasketballViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClick.onClick(arrayList.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

class BasketballViewHolder extends RecyclerView.ViewHolder {

    ItemBascetballClubBinding binding;

    public BasketballViewHolder(@NonNull ItemBascetballClubBinding binding){
        super(binding.getRoot());
        this.binding = binding;
    }

    void onBind(BasketballClub basketballClub){
        binding.textViewTeamName.setText(basketballClub.getTeamName());
        binding.imageViewIcon.setImageResource(basketballClub.getIcon());
    }
}