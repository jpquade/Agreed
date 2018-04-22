package com.example.jer.agreed2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {

    private ImageButton button;
    private TextView tview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        button = (ImageButton) findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClickContinue();
            }
        });

        tview = (TextView) findViewById(R.id.textView59);
        tview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTermsandConditions();
            }
        });
    }

    public void openClickContinue(){
        Intent intent = new Intent(this, ClickContinue.class);
        startActivity(intent);
    }

    public void openTermsandConditions(){
        Intent intent = new Intent(this, TermsandConditions.class);
        startActivity(intent);
    }
}
