package com.projecto.n1.projecto1.business;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;

import com.projecto.n1.projecto1.domain.Baraja;
import com.projecto.n1.projecto1.domain.Carta;


@Stateful
@LocalBean
public class Servicios {
	private Baraja baraja;
	private int clicks;
	private int turno;
	
	public Servicios(){
		System.out.println("Constructor Servicios");
	}
	
	public void inicializar(){
		baraja = new Baraja(); 
		baraja.empezar();
		turno++;
	}
	
	public void avanzar(int lugar){
		baraja.seguirPartida(lugar);
		turno++;
	}
	
	public Carta finalizar(){
		turno=0;
		return baraja.devolverCarta();
	}
	
	public String getCarta(int pos){
		return baraja.getCarta(pos).getNombre();
	}
	
	public String getCartasColumna(int pos){
		return baraja.getCartasColumna(pos);
	}
	
	public String getImagenColumna(int pos){
		return baraja.getImagenColumna(pos);
	}
	
	
    public void doClick(){
    	clicks++; 
    }    
    public int getClicks(){
    	return clicks; 
    }
    
    public int getTurno(){
    	return turno;
    }
    
    public void introducir(int p){
    	baraja.introducir(p);
    }
    
    public int posicion(String nombre){
    	return baraja.posicion(nombre);
    }
	
}
