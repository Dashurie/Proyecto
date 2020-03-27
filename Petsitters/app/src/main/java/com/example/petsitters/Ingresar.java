package com.example.petsitters;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ingresar extends AppCompatActivity {

    TextView textView2;
    String mensaje="Si ya tienes una cuenta inicia sesión. \n ¿No tienes una cuenta? ¡Registrate!";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);
        textView2 = findViewById(R.id.textView2);
        textView2.setText(mensaje);
    }
}
