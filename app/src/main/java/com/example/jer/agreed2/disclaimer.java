package com.example.jer.agreed2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class disclaimer extends AppCompatActivity {
    CheckBox agree;
    Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);

        TextView message = (TextView) findViewById(R.id.words);
        message.setText("Disclaimer\n\n" +
                "Last updated: April 20, 2018\n" +
                "\n" +
                "The information contained on Agreed! mobile app (the \"Service\") is for general information purposes only.\n" +
                "\n" +
                "assumes no responsibility for errors or omissions in the contents on the Service.\n" +
                "\n" +
                "In no event shall be liable for any special, direct, indirect, consequential, or incidental damages or any damages whatsoever, whether in an action of contract, negligence or other tort, arising out of or in connection with the use of the Service or the contents of the Service. reserves the right to make additions, deletions, or modification to the contents on the Service at any time without prior notice.\n" +
                "\n" +
                "does not warrant that the website is free of viruses or other harmful components.\n" +
                "\n" +
                "This Disclaimer is powered by TermsFeed\n" +
                "\n" +
                "External links disclaimer\n\n" +
                "Agreed! mobile app may contain links to external websites that are not provided or maintained by or in any way affiliated with\n" +
                "\n" +
                "Please note that the does not guarantee the accuracy, relevance, timeliness, or completeness of any information on these external websites.");
        agree = (CheckBox) findViewById(R.id.checkBox);
        agree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if ((agree.isChecked())){
                    View b = findViewById(R.id.button);
                    b.setVisibility(View.VISIBLE);
                    buttonOrder = (Button) findViewById(R.id.button);
                    buttonOrder.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            openHome();
                        }
                    });

                }
                else{
                    View b = findViewById(R.id.button);
                    b.setVisibility(View.INVISIBLE);
                }
            }
        });
    }



    public void openHome(){
        Intent intent = new Intent(this, Homepage.class);

        startActivity(intent);
    }
}
