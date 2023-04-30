package org.example;

public class Main {

    public static void main(String[] args){
        RepositorioFigurasGeometricas repo = new RepositorioFigurasGeometricas();
        FigurasGeometricas q1 = new Quadrado(10);
        FigurasGeometricas q2 = new Quadrado(20);
        FigurasGeometricas q3 = new Quadrado(40);
        FigurasGeometricas c1 = new Circulo(20);
        FigurasGeometricas c2 = new Circulo(30);

        repo.adicionar(q3);
        repo.adicionar(q2);
        repo.adicionar(c1);
        repo.adicionar(c2);
        repo.adicionar(q1);

        for(FigurasGeometricas fig : repo.getFiguras()){
            System.out.println(fig.calculaPerimetro());
            System.out.println(fig.calculaArea());
            System.out.println(fig.getTipo());
            System.out.println();
        }

        repo.ordena();
        System.out.println();

        for(FigurasGeometricas fig : repo.getFiguras()){
            System.out.println(fig.calculaPerimetro());
            System.out.println(fig.calculaArea());
            System.out.println(fig.getTipo());
        }

        System.out.println(repo.getTipo(2));
        System.out.println(repo.recupera(3).getTipo());
        repo.remover(3);
        System.out.println(repo.recupera(3).getTipo());


    }

}
