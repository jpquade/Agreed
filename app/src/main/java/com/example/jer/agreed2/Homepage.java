package com.example.jer.agreed2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Homepage extends AppCompatActivity {

    private ImageButton button;
//    private ImageButton button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        button = (ImageButton) findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPersonalLoan();
            }
        });
/*
        button2 = (ImageButton) findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRoomMate();
            }
        });
*/
    }

        public void openPersonalLoan(){
            Intent intent = new Intent(this, PersonalLoan.class);
            startActivity(intent);
        }

        public void openRoomMate(){
            Intent intent = new Intent(this, RoomMate.class);
            startActivity(intent);
        }
}
