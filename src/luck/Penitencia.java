package luck;                                                                                                                                                                                    
                                                                                                                                                                                                 
public class Penitencia
 extends Casilla {                                                                                                                                                     
	                                                                                                                                                                                             
	private double cantidadDineroPerder;                                                                                                                                                                	                                                                                                                                               
                                                                                                                                                                                                 
	public Penitencia
	(int numeroCasilla, String enunciado, int numeroMovimientos, double cantidadDineroPerder) {                                                                                     
		super(numeroCasilla, enunciado, numeroMovimientos);                                                                                                                                      
		this.cantidadDineroPerder = cantidadDineroPerder;                                                                                                                                                      		                                                                                                                                           
	}                                                                                                                                                                                            
	                                                                                                                                                                                             
	public void ganarDolares() {}                                                                                                                                                                
	public void avanzarCasilla() {}                                                                                                                                                              
                                                                                                                                                                                                 
}                                                                                                                                                                                                
                                                                                                                                                                                                 