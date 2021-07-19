package com.example.quake_report2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import static com.example.quake_report2.uriFormat.FORMAT_PARAM;
import static com.example.quake_report2.uriFormat.LIMIT_PARAM;
import static com.example.quake_report2.uriFormat.MIN_MAG_PARAM;
import static com.example.quake_report2.uriFormat.ORDERBY_PARAM;

public class editorActivity extends AppCompatActivity {
    private EditText max_Magnitude;
    private EditText limit;
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        max_Magnitude =(EditText) findViewById(R.id.mag_id);

        limit =(EditText) findViewById(R.id.limit);

        b =(Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                set();
                Intent intent = new Intent(editorActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
    void set(){
        String magi = max_Magnitude.getText().toString();
        String limi = limit.getText().toString();
        MainActivity.setMag(magi);
        MainActivity.setLim(limi);

    }

}