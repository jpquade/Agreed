package com.example.jer.agreed2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class EntryLoan extends AppCompatActivity {

    private ImageButton button;
    private EditText edit;
    private String dateStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_loan);

        edit = (EditText)findViewById(R.id.editText10);

        button = (ImageButton) findViewById(R.id.imageButton5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReviewLoan();
            }
        });
    }

    public void openReviewLoan(){
        Intent intent = new Intent(this, ReviewLoan.class);

        dateStart = edit.getText().toString();

        intent.putExtra("date1", dateStart);

        startActivity(intent);
    }
}
