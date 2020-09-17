package aula090920;

import java.util.ArrayList;

public class Corrida2 {
    public static void main(String[] args) {
        
        ArrayList <Carro> lista = new ArrayList<Carro>();

        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.setCodigo(1);
        c2.setCodigo(2);
        
        lista.add(c1);
        lista.add(c2);

        double distanciaPistaMetros = 10000;
        
                
        do
        {
            c1.setVelocidadeKmPorHora(Math.random()*200);
            c2.setVelocidadeKmPorHora(Math.random()*200);
            
            
            c1.mover(1);
            c2.mover(1);

            System.out.println(c1);
            System.out.println(c2);
        }


        while(c1.getDistanciaPercorridaEmMetros() < distanciaPistaMetros &&
              c2.getDistanciaPercorridaEmMetros() < distanciaPistaMetros
        );

        if(c1.getDistanciaPercorridaEmMetros() > c2.getDistanciaPercorridaEmMetros()){
            System.out.println("\nO carro vencedor foi o Carro 1");
        }          
        else {
            System.out.println("\nO carro vencedor foi o Carro 2");
        }

        
    }
}   
