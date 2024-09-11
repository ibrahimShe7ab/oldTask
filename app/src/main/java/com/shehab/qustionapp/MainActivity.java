package com.shehab.qustionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // تعريف زر للتنقل بين الأنشطة
    Button btn;
    // تعريف عناصر إدخال نصوص (الاسم والشركة)
    EditText editText, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // تحديد تخطيط النشاط
        setContentView(R.layout.activity_main);

        // ربط عناصر إدخال النصوص بالـ EditText الموجود في تخطيط XML
        editText = findViewById(R.id.editTextName);
        editText2 = findViewById(R.id.editTextCompany);
        // ربط الزر بـ Button الموجود في تخطيط XML
        btn = findViewById(R.id.navButton);

        // تعيين مستمع للنقر على الزر
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // إنشاء Intent للتنقل إلى النشاط profileActivity
                Intent intent = new Intent(MainActivity.this, profileActivity.class);

                // إضافة البيانات المدخلة (الاسم والشركة) إلى الـ Intent
                intent.putExtra("name", editText.getText().toString());
                intent.putExtra("company", editText2.getText().toString());

                // بدء النشاط الجديد
                startActivity(intent);
            }
        });
    }
}
