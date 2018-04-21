package com.example.jer.agreed2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReviewLoan2 extends AppCompatActivity {

    private TextView tview;
    private TextView tview2;
    private TextView tview3;
    private TextView tview4;

    String loanAmount;
    String loanExtra;
    String loanTotal;
    String dateEnd;

    int completeTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_loan2);

        completeTotal = Integer.parseInt(getIntent().getStringExtra("loanA")) + Integer.parseInt(getIntent().getStringExtra("loanE"));

        tview = (TextView)findViewById(R.id.textView63);
        tview2 = (TextView)findViewById(R.id.textView57);
        tview3 = (TextView)findViewById(R.id.textView58);
        tview4 = (TextView)findViewById(R.id.textView65);

        loanAmount =  tview.getText().toString() + (String) getIntent().getStringExtra("loanA");
        tview.setText(loanAmount);

        loanExtra =  tview2.getText().toString() + (String) getIntent().getStringExtra("loanE");
        tview.setText(loanExtra);

        loanTotal = tview3.getText().toString() + String.valueOf(completeTotal);
        tview3.setText(loanTotal);

        dateEnd =  tview4.getText().toString() + (String) getIntent().getStringExtra("date2");
        tview.setText(dateEnd);

    }
}
