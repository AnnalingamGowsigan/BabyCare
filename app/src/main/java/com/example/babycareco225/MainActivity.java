package com.example.babycareco225;

//import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnschedule;
    Button btnGraph;
    Button btnprofileManager;
    Button btnBMI;
    Button btnHealthytips;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnprofileManager=findViewById(R.id.btnProfilemanager);
btnBMI=findViewById(R.id.btnBMI);
btnHealthytips=findViewById(R.id.btnHealthTiips);



        btnprofileManager.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent myIntent = new Intent(view.getContext(), DetailsActivity.class);
        startActivityForResult(myIntent, 0);

    }
});
        btnschedule = findViewById(R.id.btnSchedule);

        btnschedule.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), VaccinationActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });




        btnBMI.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), BMIActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });
        btnHealthytips.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), HealthyTips.class);
                startActivityForResult(myIntent, 0);
            }

        });


    }
}