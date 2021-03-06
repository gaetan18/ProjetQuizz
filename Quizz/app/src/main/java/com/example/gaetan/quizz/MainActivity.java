    package com.example.gaetan.quizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.gaetan.quizz.SQLite.DataBaseManager;
import com.example.gaetan.quizz.models.Question;

import java.util.List;

    public class MainActivity extends AppCompatActivity {
        private DataBaseManager dbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button menu1 = findViewById(R.id.fastquizz);

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, FastActivity.class);
                startActivity(intent);
            }
        });
        dbm = new DataBaseManager(this);
        dbm.insertData();
        List<Question> questions = dbm.selectAll();
        for(Question question : questions){
            Log.i("data", question.getTitle());
        }
        dbm.close();



    }
}
