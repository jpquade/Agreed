package com.example.jer.agreed2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class extra extends AppCompatActivity {
    String dateanddate;
    String temp;
    String help;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);

        if (getIntent().hasExtra("Date_Time")) {
            TextView dateTimeView = (TextView) findViewById(R.id.DateAndTime);
            String text = getIntent().getExtras().getString("Date_Time");
            dateTimeView.setText(text);
            dateanddate = dateTimeView.toString();
        }
        if (getIntent().hasExtra("Borrower_Name")) {
            TextView bname = (TextView) findViewById(R.id.Borrower);
            String text = getIntent().getExtras().getString("Borrower_Name");
            bname.setText(text);
            help = bname.toString();
        }
        if (getIntent().hasExtra("Borrower_Address")) {
            TextView bAddy = (TextView) findViewById(R.id.AddressofB);
            String text = getIntent().getExtras().getString("Borrower_Address");
            bAddy.setText(text);
            temp = bAddy.toString();
        }
     if (getIntent().hasExtra("Borrower_City")) {
        TextView cityb = (TextView) findViewById(R.id.CityofB);
        String text = getIntent().getExtras().getString("Borrower_City");
         cityb.setText(text);
        temp = cityb.toString();
    }
        if (getIntent().hasExtra("Borrower_State")) {
            TextView stateb = (TextView) findViewById(R.id.StateofB);
            String text = getIntent().getExtras().getString("Borrower_State");
            stateb.setText(text);
            temp = stateb.toString();
        }
        if (getIntent().hasExtra("Lender_Name")) {
            TextView Lname = (TextView) findViewById(R.id.Lender);
            String text = getIntent().getExtras().getString("Lender_Name");
            Lname.setText(text);
            temp = Lname.toString();
        }
        if (getIntent().hasExtra("Lender_Address")) {
            TextView lAddy = (TextView) findViewById(R.id.AddressofL);
            String text = getIntent().getExtras().getString("Lender_Address");
            lAddy.setText(text);
            temp = lAddy.toString();
        }
        if (getIntent().hasExtra("Lender_City")) {
            TextView Lcity = (TextView) findViewById(R.id.CiftofL);
            String text = getIntent().getExtras().getString("Lender_City");
            Lcity.setText(text);
            temp = Lcity.toString();
        }
        if (getIntent().hasExtra("Lender_state")) {
            TextView Lstate = (TextView) findViewById(R.id.StateofL);
            String text = getIntent().getExtras().getString("Lender_state");
            Lstate.setText(text);
            temp = Lstate.toString();
        }
        if (getIntent().hasExtra("Amount_Words")) {
            TextView words = (TextView) findViewById(R.id.MoneyWords);
            String text = getIntent().getExtras().getString("Amount_Words");
            words.setText(text);
            temp = words.toString();
        }
        if (getIntent().hasExtra("Amount_Decimal")) {
            TextView dough = (TextView) findViewById(R.id.Money);
            String text = getIntent().getExtras().getString("Amount_Decimal");
            dough.setText(text);
            temp = dough.toString();
        }
}}