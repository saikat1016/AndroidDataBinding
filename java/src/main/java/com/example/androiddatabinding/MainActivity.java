package com.example.androiddatabinding;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import com.example.androiddatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        //setSupportActionBar((Toolbar) binding.toolbar);
        getSupportActionBar().setTitle("  Menu");
        getSupportActionBar().setIcon(R.mipmap.ic_launcher_round);

        binding.btnRemovingFindViewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,RemoveFindViewByIdActivity.class));
            }
        });

        binding.btnObjectBinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ObjectBindingActivity.class));

            }
        });

        binding.btnExpressionLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ExpressionLanguageBindingActivity.class));

            }
        });

    }
}
