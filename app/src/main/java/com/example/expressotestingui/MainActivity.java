package com.example.expressotestingui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etTextToChange;

    private TextView tvChangedText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChange = ( Button ) findViewById(R.id.btnChange);

        etTextToChange = (EditText) findViewById(R.id.etTextToChange);

        tvChangedText = (TextView) findViewById(R.id.tvChangedText);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvChangedText.setText(etTextToChange.getText());
            }
        });


    }
}