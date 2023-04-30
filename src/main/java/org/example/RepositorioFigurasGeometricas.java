package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RepositorioFigurasGeometricas {

    private ArrayList<FigurasGeometricas> figuras;

    public RepositorioFigurasGeometricas() {
        figuras = new ArrayList<>();
    }

    public void adicionar(FigurasGeometricas figura){
        figuras.add(figura);
    }

    public void remover(int posicao){
        figuras.remove(posicao);
    }

    public FigurasGeometricas recupera(int posicao){
        return figuras.get(posicao);
    }

    public double getPerimetro(int posicao){
        return figuras.get(posicao).calculaPerimetro();
    }

    public double getArea(int posicao){
        return figuras.get(posicao).calculaArea();
    }

    public String getTipo(int posicao){
        return figuras.get(posicao).getTipo();
    }

    public void ordena(){
        Collections.sort(figuras);
    }

    public ArrayList<FigurasGeometricas> getFiguras() {
        return figuras;
    }
}
