package com.example.gaetan.quizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FastActivity extends AppCompatActivity {


    final String GoodResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast);

        //GoodResponse = requeteSql;

        final Button reponse1=(Button)findViewById(R.id.respo
        final Button reponse2=(Button)findViewById(R.id.response2);
        final Button reponse3=(Button)findViewById(R.id.response3);
        final Button reponse4=(Button)findViewById(R.id.response4);

        reponse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ReponseChoisie = reponse1.getText().toString();
                if(ReponseChoisie.equals(GoodResponse)){
                    Toast.makeText("Bonne Reponse");
                }
                Else{
                    Toast.makeText("Perdu :Mauvaise Reponse");
                   //Arreter Activitter
                }

            }
        });

        reponse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ReponseChoisie = reponse2.getText().toString();
                if(ReponseChoisie.equals(GoodResponse)){
                    Toast.makeText("Bonne Reponse");
                }
                Else{
                    Toast.makeText("Perdu :Mauvaise Reponse");
                    //Arreter Activitter
                }
            }
        });

        reponse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ReponseChoisie = reponse3.getText().toString();
                if(ReponseChoisie.equals(GoodResponse)){
                    Toast.makeText("Bonne Reponse");
                }
                Else{
                    Toast.makeText("Perdu :Mauvaise Reponse");
                    //Arreter Activitter
                }
            }
        });

        reponse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ReponseChoisie = reponse3.getText().toString();
                if(ReponseChoisie.equals(GoodResponse)){
                    Toast.makeText("Bonne Reponse");
                }
                Else{
                    Toast.makeText("Perdu :Mauvaise Reponse");
                    //Arreter Activitter
                }
            }
        });




    }
}
