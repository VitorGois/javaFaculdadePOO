package aula020920;

public class Carro {
    int codigo;
    double velocidadeKmPorHora;     
    double distanciaPercorridaEmMetros;

    double mover(int segundos){
        double dist =  (((velocidadeKmPorHora / 60) / 60 ) * segundos) * 1000; // pra sair em metros
        distanciaPercorridaEmMetros += dist;
        return dist;
    }




    @Override
    public String toString() {
        return "Carro [codigo=" + codigo + ", distanciaPercorrida=" + distanciaPercorridaEmMetros + ", velocidade=" + velocidadeKmPorHora
                + "]";
    }


    
}
