package com.example.admin.proyecttriangulo;

/**
 * Created by Emmanuel on 15/02/2017.
 */

public class ValidarTriangulo {

    boolean isTriangulo;
    //Este metodo valida si el triangulo es correcto y devuelve un boleano
    public Boolean Validar(Triangulo obj)
    {
            if((obj.getLadoA() + obj.getLadoB()) > obj.getLadoC() && (obj.getLadoA() + obj.getLadoC()) > obj.getLadoB() && (obj.getLadoB() + obj.getLadoC()) > obj.getLadoA())
            {
                isTriangulo=true;
                return isTriangulo;
            }
            else
            {
                isTriangulo=false;
                return isTriangulo;
            }
    }
}
