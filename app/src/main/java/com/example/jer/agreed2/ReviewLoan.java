package com.example.jer.agreed2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReviewLoan extends AppCompatActivity {

    private TextView tview;
//    private TextView tview2;

    String startDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_loan);

 //       tview = (TextView)findViewById(R.id.date1);
//        tview.setText((String) getIntent().getStringExtra("date1"));

          tview = (TextView)findViewById(R.id.textView40);
          startDate = tview.getText().toString() + (String) getIntent().getStringExtra("date1");
          tview.setText(startDate);
    }
}
