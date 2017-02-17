package com.example.admin.proyecttriangulo;

import static java.lang.Math.sqrt;

/**
 * Created by admin on 15/02/2017.
 */

public class CalcularAreaTriangulo {
    //Variable tipo float para almacenar el área del triángulo
    private float Area;
    //Variable tipo float para almacernar el valor de s de la formula Area = sqrt(S*(S-LadoA)*(S-LadoB)*(S-LadoC))
    private float S;
    //Método que retorna un valor float que equivale al área del triángulo
    public float calcularArea(Triangulo obj){
        S = (obj.getLadoA()+obj.getLadoB()+obj.getLadoC())/2;
        Area = (float)sqrt(S*(S-obj.getLadoA())*(S-obj.getLadoB())*(S-obj.getLadoC()));
        return  Area;
    }
}
