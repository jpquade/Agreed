package com.example.jer.agreed2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
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

    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_loan2);

        completeTotal = Integer.parseInt(getIntent().getStringExtra("rloanA")) + Integer.parseInt(getIntent().getStringExtra("rloanE"));

        tview = (TextView)findViewById(R.id.textView63);
        tview2 = (TextView)findViewById(R.id.textView57);
        tview3 = (TextView)findViewById(R.id.textView58);
        tview4 = (TextView)findViewById(R.id.textView65);

        loanAmount =  tview.getText().toString() + (String) getIntent().getStringExtra("rloanA");
        tview.setText(loanAmount);

        loanExtra =  tview2.getText().toString() + (String) getIntent().getStringExtra("rloanE");
        tview2.setText(loanExtra);

        loanTotal = tview3.getText().toString() + String.valueOf(completeTotal);
        tview3.setText(loanTotal);

        dateEnd =  tview4.getText().toString() + (String) getIntent().getStringExtra("rdate2");
        tview4.setText(dateEnd);

        button = (ImageButton) findViewById(R.id.imageButton2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomepage();
            }
        });
    }

    public void openHomepage(){
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }
}
