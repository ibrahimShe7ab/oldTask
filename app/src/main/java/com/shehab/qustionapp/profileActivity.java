package com.shehab.qustionapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class profileActivity extends AppCompatActivity {

    // تعريف TextView لعرض الاسم والشركة
    TextView name, company;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // تحديد تخطيط النشاط
        setContentView(R.layout.activity_profile);

        // ربط الـ TextView بالـ TextView الموجود في تخطيط XML
        name = findViewById(R.id.nameTv);
        company = findViewById(R.id.companyTv);

        // استقبال الـ Intent الذي تم إرساله من MainActivity
        Intent intent = getIntent();

        // الحصول على البيانات (الاسم والشركة) من الـ Intent
        String Name = intent.getStringExtra("name");
        name.setText(Name);  // تعيين النص إلى TextView للعرض

        String Company = intent.getStringExtra("company");
        company.setText(Company);  // تعيين النص إلى TextView للعرض
    }
}
