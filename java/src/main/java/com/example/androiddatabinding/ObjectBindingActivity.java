package com.example.androiddatabinding;

import android.app.Activity;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import com.example.androiddatabinding.databinding.ActivityObjectBindingBinding;
import com.example.androiddatabinding.databinding.ActivityRemoveFindViewByIdBinding;
import com.example.androiddatabinding.model.Student;

public class ObjectBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityObjectBindingBinding  binding = DataBindingUtil.setContentView(this,R.layout.activity_object_binding);

        getSupportActionBar().setTitle("Object Binding");
        getSupportActionBar().setIcon(R.mipmap.ic_launcher_round);

        binding.setAStudent(new Student("Jon Doe", 18, 4.5));
        binding.setHandler(new EventHandler());

    }


    // Event handling

    public class EventHandler {
        public void handelClick(View view){
            Toast.makeText(ObjectBindingActivity.this, "handler clicked", Toast.LENGTH_LONG).show();
        }

        public void handelClick2(Student student){
            Toast.makeText(ObjectBindingActivity.this, student.getName(), Toast.LENGTH_LONG).show();
        }
    }

}
