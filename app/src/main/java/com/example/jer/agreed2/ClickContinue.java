package com.example.jer.agreed2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ClickContinue extends AppCompatActivity {

    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_continue);

        button = (ImageButton) findViewById(R.id.imageButton8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPersonalLoan();
            }
        });
    }

    public void openPersonalLoan(){
        Intent intent = new Intent(this, PersonalLoan.class);
        startActivity(intent);
    }
}
