package com.example.tadp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ventana2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
        Bundle e = getIntent().getExtras();
        final String nom = e.getString(getResources().getString(R.string.pnombre));
        final String tel = e.getString(getResources().getString(R.string.ptelefono));
        final String email = e.getString(getResources().getString(R.string.pemail));
        final String desc = e.getString(getResources().getString(R.string.pdescripcion));
        TextView tvNom = (TextView)findViewById(R.id.n);
        TextView tvTel = (TextView)findViewById(R.id.t);
        TextView tvEmail = (TextView)findViewById(R.id.email);
        TextView tvDesc = (TextView)findViewById(R.id.d);
        tvNom.setText("Nombre:"+nom);
        tvTel.setText("Telefono: "+tel);
        tvEmail.setText("Email: "+ email);
        tvDesc.setText("Descripción:"+desc);
        Button volver = (Button)findViewById(R.id.btnR);{
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent o = new Intent(Ventana2.this,MainActivity.class);
                    final TextView txtE = (TextView)findViewById(R.id.n);
                    final TextView txtE1 = (TextView)findViewById(R.id.t);
                    final TextView txtE2 = (TextView)findViewById(R.id.email);
                    final TextView txtE3 = (TextView)findViewById(R.id.d);
                    o.putExtra(getResources().getString(R.string.pnombre),txtE.getText().toString());
                    o.putExtra(getResources().getString(R.string.ptelefono),txtE1.getText().toString());
                    o.putExtra(getResources().getString(R.string.pemail),txtE2.getText().toString());
                    o.putExtra(getResources().getString(R.string.pdescripcion),txtE3.getText().toString());
                    startActivity(o);
                }
            });

        }
    }
}
