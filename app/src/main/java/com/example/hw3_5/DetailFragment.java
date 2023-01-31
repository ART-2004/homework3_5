package com.example.hw3_5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DetailFragment extends Fragment {

    FragmentDetailBinding binding;
    BasketballClub basketballClub;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setData();
    }

    private void setData() {
        if (getArguments() != null){
            BasketballClub basketballClub = (BasketballClub) getArguments().getSerializable("basketball");
            binding.imageViewDetail.setImageResource(basketballClub.getIcon());
            binding.textViewDescription.setText(basketballClub.getDescription());
            binding.textViewTeamNameDetail.setText(basketballClub.getTeamName());
        }
    }
}
