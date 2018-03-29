package com.example.jer.agreed2;


import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;


import android.os.Bundle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.example.jer.agreed2.R;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PersonalLoan extends AppCompatActivity {
    String dateanddate;
    String AmountWords, AmountDecimal, BName, Bcity, Bstate, Baddress, LName, Laddress,
            Lcity, Lstate;
    private static String FILE = "c:/temp/FirstPdf.pdf";
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
            Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);

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
        }

        fbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//reference to EditText
                EditText MoneyWords = (EditText) findViewById(R.id.AmountinWords);
                AmountWords = MoneyWords.toString();
                EditText MoneyDolars = (EditText) findViewById(R.id.AmountinNumbers);
                AmountDecimal = MoneyDolars.toString();
                EditText Borrower = (EditText) findViewById(R.id.BorrowName);
                BName = Borrower.toString();
                EditText BAddress = (EditText) findViewById(R.id.AddressofB);
                Baddress = BAddress.toString();
                EditText BCity = (EditText) findViewById(R.id.StateofC);
                Bcity = BCity.toString();
                EditText BState = (EditText) findViewById(R.id.StateofB);
                Bstate = BState.toString();
                EditText Lender = (EditText) findViewById(R.id.LenderName);
                LName = Lender.toString();
                EditText LAddress = (EditText) findViewById(R.id.AddressofL);
                Laddress = LAddress.toString();
                EditText LCity = (EditText) findViewById(R.id.CityNameL);
                Lcity = LCity.toString();
                EditText LState = (EditText) findViewById(R.id.StateNameL);
                Lstate = LState.toString();
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
                intent.putExtra("Date_Time", dateanddate);
                startActivity(intent);
//create document object
                Document document = new Document();
//output file path
                String outpath = Environment.getExternalStorageDirectory() + "/Loan.pdf";
                try {
//create pdf writer instance
                    PdfWriter.getInstance(document, new FileOutputStream(outpath));
//open the document for writing
                    document.open();
//add paragraph to the document
                    Paragraph para = new Paragraph();
                    addEmptyLine(para, 1);
                    para.add(new Paragraph("Personal Loan Agreement", catFont));
                    addEmptyLine(para, 3);
                    para.add(new Paragraph("Loan Amount ", smallBold));
                    document.add(new Paragraph(MoneyWords.getText().toString()));
                    para.add(new Paragraph(" Dollars($) ", smallBold));
                    document.add(new Paragraph(MoneyDolars.getText().toString()));
                    addEmptyLine(para, 2);
                    para.add(new Paragraph("Date: ", smallBold));
                    document.add(new Paragraph(dateanddate));
                    addEmptyLine(para, 2);
                    para.add(new Paragraph("Above vaule recieved by ", smallBold));
                    document.add(new Paragraph(Borrower.getText().toString()));
                    addEmptyLine(para, 1);
                    para.add(new Paragraph("Address of Borrower ", smallBold));
                    document.add(new Paragraph(BAddress.getText().toString()));
                    addEmptyLine(para, 1);
                    para.add(new Paragraph("City of, ", smallBold));
                    document.add(new Paragraph(BCity.getText().toString()));
                    para.add(new Paragraph(", State of ", smallBold));
                    document.add(new Paragraph(BState.getText().toString()));
                    addEmptyLine(para, 2);
                    para.add(new Paragraph("Name of Loaner ", smallBold));
                    document.add(new Paragraph(Lender.getText().toString()));
                    addEmptyLine(para, 1);
                    para.add(new Paragraph("Address of Loaner ", smallBold));
                    document.add(new Paragraph(LAddress.getText().toString()));
                    addEmptyLine(para, 1);
                    para.add(new Paragraph("City of, ", smallBold));
                    document.add(new Paragraph(LCity.getText().toString()));
                    para.add(new Paragraph(", State of ", smallBold));
                    document.add(new Paragraph(LState.getText().toString()));
//close the document
                    document.close();

                } catch (FileNotFoundException e) {
// TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (DocumentException e) {
// TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }


            private void addEmptyLine(Paragraph paragraph, int number) {
                for (int i = 0; i < number; i++) {
                    paragraph.add(new Paragraph(" "));
                }

            }
        });

    }
}