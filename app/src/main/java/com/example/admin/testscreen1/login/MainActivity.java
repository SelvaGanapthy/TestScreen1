package com.example.admin.testscreen1.login;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.admin.testscreen1.BSF_CRM;
import com.example.admin.testscreen1.R;

public class MainActivity extends AppCompatActivity {
    EditText id_Username, id_Userpass;
    Button b_Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

    }

    public void initialize() {
        id_Username = (EditText) findViewById(R.id.id_username);
        id_Userpass = (EditText) findViewById(R.id.id_userpass);
        b_Login = (Button) findViewById(R.id.id_blogin);
        b_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean f1, f2;
                f1 = f2 = true;
                if (id_Username.length() == 0 || id_Username.length() >= 15) {
                    id_Username.setError("Enter the username & which is less than 15 char");
                    f1 = false;
                }
                if (id_Userpass.length() == 0 || id_Userpass.length() >= 15) {
                    id_Userpass.setError("Enter the password ");
                    f2 = false;
                }
                if (f1 && f2) {
                    if (id_Username.getText().toString().equals("admin") && id_Userpass.getText().toString().equals("admin"))
                       startActivity(new Intent(MainActivity.this, BSF_CRM.class));
                    else
                        Snackbar.make(view, "username & password was wrong", Snackbar.LENGTH_LONG).show();

                }

            }
        });
    }
}
