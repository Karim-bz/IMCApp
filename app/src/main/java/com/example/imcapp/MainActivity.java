package com.example.imcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtPoids, edtTaille;
    Double strPoids, strTaille;
    Button btnValider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPoids = findViewById(R.id.edtPoids);
        edtTaille = findViewById(R.id.edtTaille);
        btnValider = findViewById(R.id.button);

        if(edtPoids.getText().toString() != null && edtTaille.getText().toString() != null){
            strPoids = Double.parseDouble(edtPoids.getText().toString());
            strTaille = Double.parseDouble(edtTaille.getText().toString());
        }

        btnValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculerImc(strPoids, strTaille);
            }
        });
    }

    public void calculerImc(Double strPoids,Double strTaille) {

        Double res;

        res = strPoids / (strTaille * strTaille);

        Toast.makeText(this, "Votre resultat est : "+res, Toast.LENGTH_SHORT).show();
    }
}