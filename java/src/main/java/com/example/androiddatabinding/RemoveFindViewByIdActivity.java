package com.example.androiddatabinding;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import com.example.androiddatabinding.databinding.ActivityRemoveFindViewByIdBinding;

public class RemoveFindViewByIdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRemoveFindViewByIdBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_remove_find_view_by_id);

        getSupportActionBar().setTitle("Remove Find View By Id");
        getSupportActionBar().setIcon(R.mipmap.ic_launcher_round);

        binding.tv1.setText("First Text");
        binding.tv2.setText("Second Text");
        binding.tv3.setText("Third Text");

    }
}
