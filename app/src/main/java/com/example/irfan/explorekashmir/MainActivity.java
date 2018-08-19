package com.example.irfan.explorekashmir;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.tab_views);
        com.example.irfan.explorekashmir.CategoryAdapter adapter = new com.example.irfan.explorekashmir.CategoryAdapter(getSupportFragmentManager(), this);

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.top_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
