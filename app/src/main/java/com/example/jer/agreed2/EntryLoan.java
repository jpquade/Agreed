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
    private EditText edit2;
    private EditText edit3;
    private EditText edit4;
    private EditText edit5;
    private EditText edit6;
    private EditText edit7;
    private EditText edit8;


    private String dateStart;
    private String borrowerName;
    private String borrowerAddress;
    private String lender;
    private String lenderAddress;
    private String dateEnd;
    private String loanAmount;
    private String loanExtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_loan);

        edit = (EditText)findViewById(R.id.editText10);
        edit2 = (EditText)findViewById(R.id.editText5);
        edit3 = (EditText)findViewById(R.id.editText4);
        edit4 = (EditText)findViewById(R.id.editText6);
        edit5 = (EditText)findViewById(R.id.editText3);
        edit6 = (EditText)findViewById(R.id.editText8);
        edit7 = (EditText)findViewById(R.id.editText9);
        edit8 = (EditText)findViewById(R.id.editText);

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
 //       Intent intent2 = new Intent(this, ReviewLoan2.class);

        dateStart = edit.getText().toString();
        borrowerName = edit2.getText().toString();
        borrowerAddress = edit3.getText().toString();
        lender = edit4.getText().toString();
        lenderAddress = edit5.getText().toString();
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

//        intent2.putExtra("loanA", loanAmount);
 //       intent2.putExtra("loanE", loanExtra);

        startActivity(intent);
    }
}
