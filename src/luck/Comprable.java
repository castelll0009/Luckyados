package luck;

public class Comprable extends Casilla {
	private  Jugador titular;
	private double precio;
	private boolean disponible;
	private double renta;
	
	public Comprable(int numeroCasilla, String enunciado, int numeroMovimientos, Jugador titular, double precio,  boolean disponible, double renta) {
		super(numeroCasilla, enunciado, numeroMovimientos);
		this.titular = titular;
		this.precio = precio;
		this.disponible = disponible;
		this.renta = renta;
	}

	public Jugador getTitular() {
		return titular;
	}

	public void setTitular(Jugador titular) {
		this.titular = titular;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public double getRenta() {
		return renta;
	}

	public void setRenta(double renta) {
		this.renta = renta;
	}


//methos
	public boolean comprarCasilla(Jugador titular) {
		return true;
	}
	public void cobrarRenta(Jugador arrendatario) {
		
	}
	public void cambiarDueño(Jugador nuevoTitular) {
		
	}
	


}
