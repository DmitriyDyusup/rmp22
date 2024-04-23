package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String newText = getIntent().getStringExtra("textFromMainActivity");

        TextView textView = findViewById(R.id.textView);
        textView.setText(newText);

        Intent resultIntent = new Intent();
        resultIntent.putExtra("resKey", newText);
        setResult(RESULT_OK, resultIntent);

        finish();
    }
}