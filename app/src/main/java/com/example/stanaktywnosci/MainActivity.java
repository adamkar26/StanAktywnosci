package com.example.stanaktywnosci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int klik = 0;
    String key = "KLIK";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                klik++;
                TextView textView = findViewById(R.id.textView);
                EditText editText = findViewById(R.id.editText);

                textView.setText(String.format("Przycisk wciśnięto %s razy", klik));
                editText.setText(String.format("Przycisk wciśnięto %s razy", klik));
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(key, klik);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);

        klik = savedInstanceState.getInt(key);

        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editText);

        textView.setText(String.format("Przycisk wciśnięto %s razy", klik));
        editText.setText(String.format("Przycisk wciśnięto %s razy", klik));

    }
}