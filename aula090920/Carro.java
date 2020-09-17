package aula090920;

/**
 * Carro
 */
public class Carro {

    private int codigo;
    private double velocidadeKmPorHora;
    private double distanciaPercorridaEmMetros; 
    
    public double mover(final int segundos){ 
        final double dist = (velocidadeKmPorHora/3.6) * (segundos);
        this.distanciaPercorridaEmMetros += dist; 
        return dist; 
    }


	@Override
	public String toString() {
		return "Carro [codigo=" + codigo + ", distanciaPercorridaEmMetros=" + distanciaPercorridaEmMetros
				+ ", velocidadeKmPorHora=" + velocidadeKmPorHora + "]";
	}

    public double getDistanciaPercorridaEmMetros() {
        return distanciaPercorridaEmMetros;
    }


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public double getVelocidadeKmPorHora() {
		return velocidadeKmPorHora;
	}


	public void setVelocidadeKmPorHora(double velocidadeKmPorHora) {
		this.velocidadeKmPorHora = velocidadeKmPorHora;
	}

    
    
    
}