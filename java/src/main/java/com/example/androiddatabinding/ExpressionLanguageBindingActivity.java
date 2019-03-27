package com.example.androiddatabinding;

import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import com.example.androiddatabinding.databinding.ActivityExpressionLanguageBindingBinding;
import com.example.androiddatabinding.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionLanguageBindingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expression_language_binding);
        ActivityExpressionLanguageBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_expression_language_binding);

        getSupportActionBar().setTitle("Object Binding");
        getSupportActionBar().setIcon(R.mipmap.ic_launcher_round);

        //binding.setAStudent(new Student("Jon Doe", 18, 4.5));

        // if data is null
        binding.setAStudent(new Student(null, 18, 4.5));
        binding.setHandler(new ExpressionLanguageBindingActivity.EventHandler());

        Student polash = new Student("Polash",25,3.5);

        List<Student> students = new ArrayList<>();
        students.add(polash);

        Map<String, Integer> nameVsAge = new HashMap<>();
        nameVsAge.put(polash.getName(),polash.getAge());

        binding.setStudents(students);
        binding.setNameVsAge(nameVsAge);

    }

    // Event handling

    public class EventHandler {
        public void handelClick(View view){
            Toast.makeText(ExpressionLanguageBindingActivity.this, "handler clicked", Toast.LENGTH_LONG).show();
        }

        public void handelClick2(Student student){
            Toast.makeText(ExpressionLanguageBindingActivity.this, student.getName(), Toast.LENGTH_LONG).show();
        }
    }

}
