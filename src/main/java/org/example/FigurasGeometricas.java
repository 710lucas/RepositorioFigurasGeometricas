package org.example;

public interface FigurasGeometricas extends Comparable<FigurasGeometricas>{

    public double calculaPerimetro();
    public double calculaArea();
    public String getTipo();


    @Override
    int compareTo(FigurasGeometricas o);
}
