package luck;

import java.util.ArrayList;
import java.util.List;

public class Jugador implements Lanzar, Comprar, Vender {
	private String nombre;
    private int saldo;
    private boolean estado;    
    private boolean casillaUbicacion;
    private List<Casilla> listaCasillasCompradas = new ArrayList<>();
    
    public int LanzarDado(){
    	
    	return 0;
    }
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public boolean isCasillaUbicacion() {
		return casillaUbicacion;
	}

	public void setCasillaUbicacion(boolean casillaUbicacion) {
		this.casillaUbicacion = casillaUbicacion;
	}

	public List<Casilla> getListaCasillasCompradas() {
		return listaCasillasCompradas;
	}

	public void setListaCasillasCompradas(List<Casilla> listaCasillasCompradas) {
		this.listaCasillasCompradas = listaCasillasCompradas;
	}

	public void Moverse(int numeroMovimiento) {
    	
    }
    
    public void ComprarCasilla(Casilla casillaComprar) {
    	
    }

	@Override
	public void venderCasilla(Jugador titular, Jugador nuevoTitular) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ComprarCasilla() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LanzarDados() {
		// TODO Auto-generated method stub
		
	}
}
