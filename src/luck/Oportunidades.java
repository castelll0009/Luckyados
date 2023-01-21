package luck;

public class Oportunidades extends Casilla {
	
	private double cantidadGanar;
	

	public Oportunidades(int numeroCasilla, String enunciado, int numeroMovimientos, double cantidadDineroGanar) {
		super(numeroCasilla, enunciado, numeroMovimientos);
		this.cantidadGanar = cantidadGanar;
		
	}
	
	public void ganarDolares() {}
	public void avanzarCasilla() {}

}
