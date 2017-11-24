package com.example.dm2.app_operar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Operar extends AppCompatActivity {

    private EditText txtPimer;
    private EditText txtSegundo;
    private TextView lblResultado;
    private Button btnSumar;
    private Button btnRestar;
    private Button btnDividir;
    private Button btnMultiplicar;
    private Button botonpulsado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operar);
        btnSumar.findViewById(R.id.btnSumar);
    }

        public void sumar (View v){

                        int num1=Integer.parseInt(txtPimer.getText().toString());
                        int num2=Integer.parseInt(txtSegundo.getText().toString());
                        int resultado=num1+num2;

                        lblResultado.setText(lblResultado.getText()+" "+resultado);

        }




}
