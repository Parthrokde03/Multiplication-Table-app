package com.example.multiplicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edittext;
    Button button;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = findViewById(R.id.etNumber);
        button = findViewById(R.id.btn);
        textview = findViewById(R.id.tvTabel);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = edittext.getText().toString();
                if (!input.isEmpty()){
                    int number = Integer.parseInt(input);

                    String Tabel = generateMultiplication(number);
                    textview.setText(Tabel);
                }
                else {
                    textview.setText("");
                }

            }
        });
    }
    private String generateMultiplication(int num){
        StringBuilder tabel = new StringBuilder();
        for (int i = 1; i <= 10; i++){
            int result = num * i;
            tabel.append(num+ " ").append("x").append(" "+i+ " ").append("=").append( " "+result).append("\n");
        }
        return tabel.toString();

    }
}