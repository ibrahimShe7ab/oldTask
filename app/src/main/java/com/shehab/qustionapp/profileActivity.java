package com.shehab.qustionapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class profileActivity extends AppCompatActivity {
TextView name,company;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_profile);
         name=findViewById(R.id.nameTv);
         company=findViewById(R.id.companyTv);
        Intent intent= getIntent();
        String Name=intent.getStringExtra("name");
        name.setText(Name);
        String Company=intent.getStringExtra("company");
        company.setText(Company);

    }
}


