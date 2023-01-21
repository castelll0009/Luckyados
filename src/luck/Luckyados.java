/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luck;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Castell
 */
public class Luckyados {
	private String nombre;
    private int cantidadJugadores;
    private int cantidadCasillas;     
    private List<Jugador> listaJugadores = new ArrayList<>();
    private List<Casilla> ListaCasillas = new ArrayList<>();
    
    public Luckyados( String nombre, int cantidadJugadores, int cantidadCasillas) {
        this.cantidadJugadores = cantidadJugadores;
        this.nombre = nombre;
        this.cantidadCasillas = cantidadCasillas;                
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadJugadores() {
		return cantidadJugadores;
	}

	public void setCantidadJugadores(int cantidadJugadores) {
		this.cantidadJugadores = cantidadJugadores;
	}

	public int getCantidadCasillas() {
		return cantidadCasillas;
	}

	public void setCantidadCasillas(int cantidadCasillas) {
		this.cantidadCasillas = cantidadCasillas;
	}

	public List<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(List<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	public List<Casilla> getListaCasillas() {
		return ListaCasillas;
	}

	public void setListaCasillas(List<Casilla> listaCasillas) {
		ListaCasillas = listaCasillas;
	}  
	
	public void AgregarCasillas() {
		
	}
	public void EliminarCasillas() {
		
	}
   
}
