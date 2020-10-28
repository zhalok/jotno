package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.BreakIterator;


public class MainActivity extends AppCompatActivity  {

    Button button_login,button_newprofile,button_searchfortution;
    TextView textView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_login=(Button)findViewById(R.id.loginbutton);
        button_searchfortution=(Button)findViewById(R.id.look);
        button_newprofile=(Button)findViewById(R.id.profilecreatebutton);
        textView=(TextView)findViewById(R.id.msg);


            button_login.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Login_page.class);
                    startActivity(intent);

                }
            });







    }





}