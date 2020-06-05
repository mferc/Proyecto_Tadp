package com.example.tadp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sig =(Button)findViewById(R.id.bntGuardar);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent e = new Intent(MainActivity.this,Ventana2.class);
                final EditText txtE = (EditText)findViewById(R.id.etDato);
                final EditText txtE1 = (EditText)findViewById(R.id.etDato1);
                final EditText txtE2 = (EditText)findViewById(R.id.etDato2);
                final EditText txtE3 = (EditText)findViewById(R.id.etDato3);
                e.putExtra(getResources().getString(R.string.pnombre),txtE.getText().toString());
                e.putExtra(getResources().getString(R.string.ptelefono),txtE1.getText().toString());
                e.putExtra(getResources().getString(R.string.pemail),txtE2.getText().toString());
                e.putExtra(getResources().getString(R.string.pdescripcion),txtE3.getText().toString());
                startActivity(e);
            }
        });
    }
    protected void onResume() {
        super.onResume();

        Bundle e = getIntent().getExtras();
        if (e != null) {
            final String nom = e.getString(getResources().getString(R.string.pnombre));
            final String tel = e.getString(getResources().getString(R.string.ptelefono));
            final String email = e.getString(getResources().getString(R.string.pemail));
            final String desc = e.getString(getResources().getString(R.string.pdescripcion));
            EditText tvNom = (EditText) findViewById(R.id.etDato);
            EditText tvTel = (EditText) findViewById(R.id.etDato1);
            EditText tvEmail = (EditText) findViewById(R.id.etDato2);
            EditText tvDesc = (EditText) findViewById(R.id.etDato3);
            tvNom.setText( nom);
            tvTel.setText( tel);
            tvEmail.setText(email);
            tvDesc.setText( desc);
        }

    }


}
