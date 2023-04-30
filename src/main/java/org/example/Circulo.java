package org.example;

public class Circulo implements FigurasGeometricas{

    private double raio;

    public Circulo (double raio){
        this.raio = raio;
    }

    @Override
    public double calculaPerimetro() {
        return 2*Math.PI*raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI*(raio*raio);
    }

    @Override
    public String getTipo() {
        return "Circulo";
    }

    @Override
    public int compareTo(FigurasGeometricas o) {
        return Double.compare(calculaArea(), o.calculaArea());
        //0 se for igual
        //>0 se o primeiro for maior q o segundo
        //<0 se o primeiro for menor que o segundo
    }
}
