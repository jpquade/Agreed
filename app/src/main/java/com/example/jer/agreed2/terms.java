package com.example.jer.agreed2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class terms extends AppCompatActivity {
    CheckBox agree;
    Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        TextView message = (TextView) findViewById(R.id.words);
        message.setText("Terms and Conditions (\"Terms\")\n\n" +
                "Last updated: April 20, 2018\n" +
                "\n" +
                "Please read these Terms and Conditions (\"Terms\", \"Terms and Conditions\") carefully before using the Agreed application (the \"Service\") operated by Agreed! (\"us\", \"we\", or \"our\").\n" +
                "\n" +
                "Your access to and use of the Service is conditioned on your acceptance of and compliance with these Terms. These Terms apply to all visitors, users and others who access or use the Service.\n" +
                "\n" +
                "By accessing or using the Service you agree to be bound by these Terms. If you disagree with any part of the terms then you may not access the Service. This Terms and Conditions agreement for Agreed! is powered by TermsFeed.\n" +
                "\n" +
                "Links To Other Applications\n\n" +
                "Our Service may contain links to third-party web sites or services that are not owned or controlled by Agreed!.\n" +
                "\n" +
                "Agreed! has no control over, and assumes no responsibility for, the content, privacy policies, or practices of any third party web sites or services. You further acknowledge and agree that Agreed! shall not be responsible or liable, directly or indirectly, for any damage or loss caused or alleged to be caused by or in connection with use of or reliance on any such content, goods or services available on or through any such web sites or services.\n" +
                "\n" +
                "We strongly advise you to read the terms and conditions and privacy policies of any third-party web sites or services that you visit.\n" +
                "\n" +
                "Governing Law\n\n" +
                "These Terms shall be governed and construed in accordance with the laws of Arizona, United States, without regard to its conflict of law provisions.\n" +
                "\n" +
                "Our failure to enforce any right or provision of these Terms will not be considered a waiver of those rights. If any provision of these Terms is held to be invalid or unenforceable by a court, the remaining provisions of these Terms will remain in effect. These Terms constitute the entire agreement between us regarding our Service, and supersede and replace any prior agreements we might have between us regarding the Service.\n" +
                "\n" +
                "Changes\n\n" +
                "We reserve the right, at our sole discretion, to modify or replace these Terms at any time. If a revision is material we will try to provide at least 30 days notice prior to any new terms taking effect. What constitutes a material change will be determined at our sole discretion.\n" +
                "\n" +
                "By continuing to access or use our Service after those revisions become effective, you agree to be bound by the revised terms. If you do not agree to the new terms, please stop using the Service.\n" +
                "\n" +
                "Contact Us\n\n" +
                "If you have any questions about these Terms, please contact us.");
    agree = (CheckBox) findViewById(R.id.checkBox);
    agree.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            View b = findViewById(R.id.button);
            b.setVisibility(View.VISIBLE);
        }
    });
               buttonOrder = (Button) findViewById(R.id.button);
               buttonOrder.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       openDis();
                   }
               });
    }



    public void openDis(){
        Intent intent = new Intent(this, disclaimer.class);

        startActivity(intent);
    }
}
