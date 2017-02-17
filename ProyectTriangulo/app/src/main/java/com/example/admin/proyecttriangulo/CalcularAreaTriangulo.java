package com.example.admin.proyecttriangulo;

/**
 * Created by admin on 15/02/2017.
 */

public class CalcularAreaTriangulo {
    private float area;
    private float s;
    public float CalcularArea(Triangulo obj){
            s = (obj.getLadoA()+obj.getLadoB()+obj.getLadoC())/2;
            area = (float)Math.sqrt(s*(s-obj.getLadoA())*(s-obj.getLadoB())*(s-obj.getLadoC()));
        return  area;
    }
}
