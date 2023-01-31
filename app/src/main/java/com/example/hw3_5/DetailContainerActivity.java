package com.example.hw3_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.SurfaceControl;

import com.example.hw3_5.databinding.ActivityDetailContainerBinding;

public class DetailContainerActivity<ActivityDetailContainerBinding> extends AppCompatActivity {

    ActivityDetailContainerBinding binding;
    BasketballClub basketballClub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailContainerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
    }

    private void setData() {
        if (getIntent().getSerializableExtra("basketball") != null) {
            BasketballClub basketballClub = (BasketballClub) getIntent().getSerializableExtra("basketball");
            transaction(basketballClub);
        }
    }

        private void transaction(BasketballClub basketballClub) {
            DetailFragment detailFragment = new DetailFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("basketball", basketballClub);
            detailFragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().add(R.id.container_view, detailFragment).commit();
        }
}