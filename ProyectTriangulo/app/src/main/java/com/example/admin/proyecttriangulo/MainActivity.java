package com.example.admin.proyecttriangulo;

import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ladoA,ladoB,ladoC,areaTriangulo,validacion;
    public float ResArea;
    public boolean ResValidacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se crea la referencia al botón Verificar que mostrará si es un triángulo o no
        Button btnVerificar = (Button) findViewById(R.id.btnVerificar);

        //Se crea la referencia al botón Calcular que mostrará el resultado del cálculo del área
        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);

        ladoA=(EditText)findViewById(R.id.txtLadoA);
        ladoB=(EditText)findViewById(R.id.txtLadoB);
        ladoC=(EditText)findViewById(R.id.txtLadoC);
        validacion=(EditText)findViewById(R.id.txtVerificar);
        areaTriangulo=(EditText)findViewById(R.id.txtResultado);

        //Se crea la escucha anónima para ejecutar una acción al presionar el botón Verificar
        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Triangulo objTriangulo=new Triangulo();
                    objTriangulo.LadoA= Float.parseFloat(ladoA.getText().toString());
                    objTriangulo.LadoB= Float.parseFloat(ladoB.getText().toString());
                    objTriangulo.LadoC= Float.parseFloat(ladoC.getText().toString());
                    ValidarTriangulo objValidar=new ValidarTriangulo();
                    ResValidacion= objValidar.Validar(objTriangulo);
                    if (ResValidacion==true){
                        validacion.setText("Es un triángulo");
                    }
                    else {
                        validacion.setText("No es un triángulo");
                    }
                }
                catch(Exception e){
                    Toast.makeText(null,"Favor de verificar los datos introducidos", Toast.LENGTH_SHORT).show();
                }

                //En esta parte se hace llamado al método para verificar si es un triángulo
                //La respuesta se muestra en un TextView llamado txtVerificar
            }
        });

        //Se crea la escucha anónima para ejecutar una acción al presionar el botón Calcular
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try
                {
                    Triangulo objTriangulo=new Triangulo();
                    objTriangulo.LadoA= Float.parseFloat(ladoA.getText().toString());
                    objTriangulo.LadoB= Float.parseFloat(ladoB.getText().toString());
                    objTriangulo.LadoC= Float.parseFloat(ladoC.getText().toString());
                    CalcularAreaTriangulo objCalculoArea=new CalcularAreaTriangulo();
                    ResArea= objCalculoArea.calcularArea(objTriangulo);
                    areaTriangulo.setText(Float.toString(ResArea));
                }catch (Exception e)
                {
                    Toast.makeText(null,"Favor de verificar los datos introducidos", Toast.LENGTH_SHORT).show();
                }
                //En esta parte se hace llamado al método para calcular el area de un triángulo
                //El resultado se muestra en un TextView llamado txtResultado
            }
        });
    }
}
