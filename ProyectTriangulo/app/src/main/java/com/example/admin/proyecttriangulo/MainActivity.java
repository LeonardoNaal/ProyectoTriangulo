package com.example.admin.proyecttriangulo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se crea la referencia al botón Verificar que mostrará si es un triángulo o no
        Button btnVerificar = (Button) findViewById(R.id.btnVerificar);

        //Se crea la referencia al botón Calcular que mostrará el resultado del cálculo del área
        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);

        //Se crea la escucha anónima para ejecutar una acción al presionar el botón Verificar
        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //En esta parte se hace llamado al método para verificar si es un triángulo
                //La respuesta se muestra en un TextView llamado txtVerificar

            }
        });

        //Se crea la escucha anónima para ejecutar una acción al presionar el botón Calcular
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //En esta parte se hace llamado al método para calcular el area de un triángulo
                //El resultado se muestra en un TextView llamado txtResultado
            }
        });
    }
}
