package aula160920;

import java.util.ArrayList;

public class Corrida {
    public static void main(String[] args) {

        ArrayList<Carro> carros = new ArrayList<Carro>();
        ArrayList<Carro> finalCorrida = new ArrayList<Carro>();
        ArrayList<Carro> desclassificados = new ArrayList<Carro>();
        
        int quantCarros = 100;
        int tamanhoPista = 10000;

        for (int i = 0; i < quantCarros; i++) {
            Carro c = new Carro();
            c.setCodigo(i);
            c.setConsumo(Math.random() * 10 + 5);
            c.abastecer(Math.random() * 5);
            carros.add(c);
        }

        //Tem carro na corrida ainda?
        while (carros.size() > 0){
            //Move todos os carros
            for (Carro c : carros) {
                c.setVelocidadeKmPorHora(Math.random() * 200);
                //Conseguiu mover?
                if (c.mover(1) > 0) {
                    if (c.getDistanciaPercorridaEmMetros() > tamanhoPista) {
                        System.out.println("Carro " + c.getCodigo() + " terminou a corrida");
                        finalCorrida.add(c);
                    }
                } else {
                    System.out.println("Carro " + c.getCodigo() + " está desclassificado");
                    desclassificados.add(c);
                }
            }
            //Remove os carros desclassificados ou que já terminaram a corrida
            carros.removeAll(finalCorrida);
            carros.removeAll(desclassificados);
        }

        System.out.println("Classificação final");
        int cont = 1;
        for (Carro c : finalCorrida) {
            System.out.println(cont + "o." + c.getCodigo());
            cont++;
        }
        System.out.println("Desclassificados");
        for (Carro c : desclassificados) {
            System.out.println(cont + "o." + c.getCodigo());

        }

        Carro c = new Carro();
        System.out.println(c);
    }
}   
