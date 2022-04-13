package com.majorxp.contactform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
private EditText toEntry, subjectEntry, messageEntry;
private AppCompatButton btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initElements();
        sendEmail();


    }

    private void sendEmail() {
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toEntry.setText("");
                subjectEntry.setText("");
                messageEntry.setText("");
            }
        });


    }

    private void initElements() {
        toEntry = findViewById(R.id.editTxtEmail);
        subjectEntry = findViewById(R.id.editTxtSubject);
        messageEntry = findViewById(R.id.editTxtMessage);
        btnSend = findViewById(R.id.btnSend);
    }
}