package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_page extends AppCompatActivity {
private Button login_button;
private EditText username= (EditText)findViewById(R.id.user);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        login_button=(Button)findViewById(R.id.login);
        /*
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username!=null)
                {
                    Intent intent= new Intent(Login_page.this,registration_page.class);
                    startActivity(intent);

                }
                else
                {
                    Toast.makeText(Login_page.this,"sorry provde ur username plz",Toast.LENGTH_SHORT).show();
                }
            }
        });
*/
    }
}