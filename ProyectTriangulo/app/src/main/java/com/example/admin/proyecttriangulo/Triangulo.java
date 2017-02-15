package com.example.admin.proyecttriangulo;

/**
 * Created by admin on 15/02/2017.
 */

public class Triangulo {
    public float LadoA;
    public float LadoB;
    public float LadoC;
    public float Area;

    public float getArea() {
        return Area;
    }

    public void setArea(float area) {
        Area = area;
    }

    public boolean isComprobar() {
        return Comprobar;
    }

    public void setComprobar(boolean comprobar) {
        Comprobar = comprobar;
    }

    public boolean Comprobar;

    public float getLadoA() {
        return LadoA;
    }

    public void setLadoA(float ladoA) {
        LadoA = ladoA;
    }

    public float getLadoB() {
        return LadoB;
    }

    public void setLadoB(float ladoB) {
        LadoB = ladoB;
    }

    public float getLadoC() {
        return LadoC;
    }

    public void setLadoC(float ladoC) {
        LadoC = ladoC;
    }

    }
