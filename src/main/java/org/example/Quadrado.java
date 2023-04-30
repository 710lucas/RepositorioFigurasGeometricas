package org.example;

public class Quadrado implements FigurasGeometricas{

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calculaPerimetro() {
        return lado*4;
    }

    @Override
    public double calculaArea() {
        return lado*lado;
    }

    @Override
    public String getTipo() {
        return "Quadrado";
    }

    @Override
    public int compareTo(FigurasGeometricas o) {
        return Double.compare(calculaArea(), o.calculaArea());
        //0 se for igual
        //>0 se o primeiro for maior q o segundo
        //<0 se o primeiro for menor que o segundo
    }
}

