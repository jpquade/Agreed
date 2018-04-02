package com.example.jer.agreed2;


import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;


import android.os.Bundle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PersonalLoan extends AppCompatActivity {
    String dateanddate, dt;
    String AmountWords, AmountDecimal, BName, Bcity, Bstate, Baddress, LName, Laddress,
            Lcity, Lstate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_loan);
        Button fbutton = (Button) findViewById(R.id.Finalize);

        if (getIntent().hasExtra("example.jer.agreed2.SOMETHING")) {
            TextView dateTimeView = (TextView) findViewById(R.id.DandT);
            String text = getIntent().getExtras().getString("example.jer.agreed2.SOMETHING");
            dateTimeView.setText(text);
            dateanddate = dateTimeView.toString();
            dt = text;
        }

        fbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//reference to EditText
                EditText MoneyWords = (EditText) findViewById(R.id.AmountinWords);
                AmountWords = MoneyWords.getText().toString();
                EditText MoneyDolars = (EditText) findViewById(R.id.AmountinNumbers);
                AmountDecimal = MoneyDolars.getText().toString();
                EditText Borrower = (EditText) findViewById(R.id.BorrowName);
                BName = Borrower.getText().toString();
                EditText BAddress = (EditText) findViewById(R.id.AddressofB);
                Baddress = BAddress.getText().toString();
                EditText BCity = (EditText) findViewById(R.id.StateofC);
                Bcity = BCity.getText().toString();
                EditText BState = (EditText) findViewById(R.id.StateofB);
                Bstate = BState.getText().toString();
                EditText Lender = (EditText) findViewById(R.id.LenderName);
                LName = Lender.getText().toString();
                EditText LAddress = (EditText) findViewById(R.id.AddressofL);
                Laddress = LAddress.getText().toString();
                EditText LCity = (EditText) findViewById(R.id.CityNameL);
                Lcity = LCity.getText().toString();
                EditText LState = (EditText) findViewById(R.id.StateNameL);
                Lstate = LState.getText().toString();

                Intent intent = new Intent(getApplicationContext(), extra.class);
                intent.putExtra("Amount_Words", AmountWords);
                intent.putExtra("Amount_Decimal", AmountDecimal);
                intent.putExtra("Borrower_Name", BName);
                intent.putExtra("Borrower_Address", Baddress);
                intent.putExtra("Borrower_City", Bcity);
                intent.putExtra("Borrower_State", Bstate);
                intent.putExtra("Lender_Name", LName);
                intent.putExtra("Lender_Address", Laddress);
                intent.putExtra("Lender_City", Lcity);
                intent.putExtra("Lender_state", Lstate);
                intent.putExtra("Date_Time", dt);
                startActivity(intent);
            }
        });

    }
}