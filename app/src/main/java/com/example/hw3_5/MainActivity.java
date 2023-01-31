package com.example.hw3_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.hw3_5.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick {

    ActivityMainBinding binding;
    BasketballAdapter adapter;
    ArrayList<BasketballClub> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fillList();
        setAdapter();
    }

    private void fillList() {
        arrayList = new ArrayList();
        arrayList.add(new BasketballClub("Голден Стэйт Уорриорз 2014-15", R.drawable.golden_state_warriors_2014_15, getString(R.string.golden_state_warriors_2014_15_description)));
        arrayList.add(new BasketballClub("Бостон Селтикс 1985-86", R.drawable.boston_celtics_85_86, getString(R.string.boston_celtics_85_86_description)));
        arrayList.add(new BasketballClub("Чикаго Буллз 1991-92", R.drawable.chicago_bulls_1991_92, getString(R.string.chicago_bulls_91_92_description)));
        arrayList.add(new BasketballClub("Лос-Анджелес Лэйкерс 1990-00", R.drawable.chicago_bulls_1995_96, getString(R.string.chicago_bulls_95_96_description)));
        arrayList.add(new BasketballClub("Даллас Маверикс 2006-07", R.drawable.chicago_bulls_1996_97, getString(R.string.chicago_bulls_96_97_description)));
        arrayList.add(new BasketballClub("Бостон Селтикс 1972-73", R.drawable.dallas_mavericks_2006_07, getString(R.string.dallas_mavericks_2006_07_description)));
        arrayList.add(new BasketballClub("Филадельфия Севенти Сиксерс 1966-67", R.drawable.lakers_1971_72, getString(R.string.lakers_1971_72_description)));
        arrayList.add(new BasketballClub("Лос-Анджелес Лэйкерс 1971-72", R.drawable.lakers_1990_00, getString(R.string.lakers_1990_00_description)));
        arrayList.add(new BasketballClub("Чикаго Буллз 1996-97", R.drawable.boston_celtics_1972_73, getString(R.string.boston_celtics_72_73_description)));
        arrayList.add(new BasketballClub("Чикаго Буллз 1995-96", R.drawable.philadelphia_1966_67, getString(R.string.philadelphia_1966_67_description)));
    }

    private void setAdapter() {
        adapter = new BasketballAdapter(arrayList, this);
        binding.recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(BasketballClub basketballClub) {
        Intent intent = new Intent(MainActivity.this, DetailContainerActivity.class);
        intent.putExtra("basketball", basketballClub);
        startActivity(intent);
    }
}

}