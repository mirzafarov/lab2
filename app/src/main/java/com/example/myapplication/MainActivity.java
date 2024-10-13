package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button btnCountCharacters;
    private Button btnCountWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        btnCountCharacters = findViewById(R.id.btnCountCharacters);
        btnCountWords = findViewById(R.id.btnCountWords);


        btnCountCharacters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                int characterCount = TextUtil.countCharacters(text);
                Toast.makeText(MainActivity.this, "Characters: " + characterCount, Toast.LENGTH_SHORT).show();
            }
        });


        btnCountWords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                int wordCount = TextUtil.countWords(text);
                Toast.makeText(MainActivity.this, "Words: " + wordCount, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
