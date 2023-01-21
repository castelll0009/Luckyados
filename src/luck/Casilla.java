package luck;

public class Casilla {
	private int numeroCasilla;
	private String enunciado;
	private int numeroMovimientos;
	
	
	public void applicarEfectoCasilla() {}


	public Casilla(int numeroCasilla, String enunciado, int numeroMovimientos) {		
		this.numeroCasilla = numeroCasilla;
		this.enunciado = enunciado;
		this.numeroMovimientos = numeroMovimientos;
	}


	public int getNumeroCasilla() {
		return numeroCasilla;
	}


	public void setNumeroCasilla(int numeroCasilla) {
		this.numeroCasilla = numeroCasilla;
	}


	public String getEnunciado() {
		return enunciado;
	}


	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}


	public int getNumeroMovimientos() {
		return numeroMovimientos;
	}


	public void setNumeroMovimientos(int numeroMovimientos) {
		this.numeroMovimientos = numeroMovimientos;
	}
}

