package com.shehab.qustionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn ;
    EditText editText,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         editText=findViewById(R.id.editTextName);
         editText2=findViewById(R.id.editTextCompany);
         btn=findViewById(R.id.navButton);

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent=new Intent(MainActivity.this ,profileActivity.class);
                 intent.putExtra("name",editText.getText().toString());
                 intent.putExtra("company",editText2.getText().toString());
                 startActivity(intent);
             }
         });



    }
}