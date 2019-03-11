package com.edu.kiet.dsc_youtube_card_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class informationActivity extends AppCompatActivity {

    Button btn_changetext;
    TextView tv_text;
    EditText eInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        tv_text=findViewById(R.id.change);
        btn_changetext=findViewById(R.id.btn_changetext);
        eInput =findViewById(R.id.input);

        btn_changetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st=eInput.getText().toString();
                tv_text.setText(st);
                Toast.makeText(getApplicationContext(),"Successfully commented",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
