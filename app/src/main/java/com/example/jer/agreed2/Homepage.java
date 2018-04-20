package com.example.jer.agreed2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Homepage extends AppCompatActivity {

    private ImageButton button;
    private ImageButton button2;
    Calendar calendar;
    SimpleDateFormat simpleDateFormat;
    String Date;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        txt = (TextView) findViewById(R.id.Terms);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), terms.class);
                intent2.putExtra("example.jer.agreed2.SOMETHING", Date);
                openTerms();
            }
        });

        button = (ImageButton) findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PersonalLoan.class);
                intent.putExtra("example.jer.agreed2.SOMETHING", Date);
                openPersonalLoan();
            }
        });

        button2 = (ImageButton) findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRoomMate();
            }
        });

        calendar = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date = simpleDateFormat.format(calendar.getTime());
    }

    public void openPersonalLoan(){
        Intent intent = new Intent(this, PersonalLoan.class);
        intent.putExtra("example.jer.agreed2.SOMETHING", Date);
        startActivity(intent);
    }

    public void openTerms(){
        Intent intent = new Intent(this, terms.class);
        intent.putExtra("example.jer.agreed2.SOMETHING", Date);
        startActivity(intent);
    }

    public void openRoomMate(){
        Intent intent = new Intent(this, RoomMate.class);
        startActivity(intent);
    }
}
