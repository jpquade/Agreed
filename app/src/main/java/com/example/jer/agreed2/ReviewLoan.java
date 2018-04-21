package com.example.jer.agreed2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ReviewLoan extends AppCompatActivity {

    private TextView tview;
    private TextView tview2;
    private TextView tview3;
    private TextView tview4;
    private TextView tview5;
    private TextView tview6;
    private TextView tview7;
    private TextView tview8;

    String startDate;
    String borrowerName;
    String borrowerAddress;
    String lenderName;
    String lenderAddress;
    String dateEnd;
    String loanTotal;

    int completeTotal;

    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_loan);

        completeTotal = Integer.parseInt(getIntent().getStringExtra("loanA")) + Integer.parseInt(getIntent().getStringExtra("loanE"));

        tview = (TextView)findViewById(R.id.textView40);
        tview2 = (TextView)findViewById(R.id.textView42);
        tview3 = (TextView)findViewById(R.id.textView44);
        tview4 = (TextView)findViewById(R.id.textView43);
        tview5 = (TextView)findViewById(R.id.textView45);
        tview6 = (TextView)findViewById(R.id.textView51);
        tview7 = (TextView)findViewById(R.id.textView49);
        tview8 = (TextView)findViewById(R.id.textView53);

        startDate =  tview.getText().toString() + (String) getIntent().getStringExtra("date1");
        tview.setText(startDate);

        borrowerName = (String) getIntent().getStringExtra("borrowerN") + tview2.getText().toString();
        tview2.setText(borrowerName);

        borrowerAddress = (String) getIntent().getStringExtra("borrowerA") + tview3.getText().toString();
        tview3.setText(borrowerAddress);

        lenderName = (String) getIntent().getStringExtra("lenderN") + tview4.getText().toString();
        tview4.setText(lenderName);

        lenderAddress = (String) getIntent().getStringExtra("lenderA") + tview5.getText().toString();
        tview5.setText(lenderAddress);

        dateEnd = tview6.getText().toString() + (String) getIntent().getStringExtra("date2");
        tview6.setText(dateEnd);

        lenderName = tview7.getText().toString() + (String) getIntent().getStringExtra("lenderN");
        tview7.setText(lenderName);

        loanTotal = tview8.getText().toString() + String.valueOf(completeTotal);
        tview8.setText(loanTotal);

        button = (ImageButton) findViewById(R.id.imageButton6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReviewLoan2();
            }
        });
    }

    public void openReviewLoan2(){
        Intent intent = new Intent(this, ReviewLoan2.class);
        
        dateEnd = edit6.getText().toString();
        loanAmount = edit7.getText().toString();
        loanExtra = edit8.getText().toString();

        if(loanAmount.equals("")){
            loanAmount = "0";
        }
        if(loanExtra.equals("")){
            loanExtra = "0";
        }


        intent.putExtra("date1", dateStart);
        intent.putExtra("borrowerN", borrowerName);
        intent.putExtra("borrowerA", borrowerAddress);
        intent.putExtra("lenderN", lender);
        intent.putExtra("lenderA", lenderAddress);
        intent.putExtra("date2", dateEnd);
        intent.putExtra("loanA", loanAmount);
        intent.putExtra("loanE", loanExtra);

        startActivity(intent);
    }
}