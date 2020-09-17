package aula160920;

public class Carro {

    private int codigo;
    private double velocidade;
    private double distanciaPercorrida;
    private double tanque;
    private double consumo;

    public double mover(final int segundos) {
        if (tanque > 0) {
            double dist = (velocidade / 3.6) * (segundos);
            tanque -= (dist*0.001)/consumo;
            this.distanciaPercorrida += dist;
            return dist;
        } else {
            return 0;
        }        
    }

    public boolean abastecer(double combustivel) {
        if (combustivel < 0) {
            return false;
        }

        if (combustivel > 50) {
            this.tanque = 50;
        } else {
            if (combustivel > 0) {
                this.tanque = combustivel;
            }
        }

        return true;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }

    public double getDistanciaPercorridaEmMetros() {
        return distanciaPercorrida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getVelocidadeKmPorHora() {
        return velocidade;
    }

    public void setVelocidadeKmPorHora(double velocidadeKmPorHora) {
        this.velocidade = velocidadeKmPorHora;
    }

    @Override
    public String toString() {
        return "Carro [codigo=" + codigo + ", consumo=" + consumo + ", distanciaPercorrida=" + distanciaPercorrida
                + ", tanque=" + tanque + ", velocidade=" + velocidade + "]";
    }

}