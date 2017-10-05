package com.projecto.n1.projecto1.domain;

public class Carta {
	private String nombre;
	
	public Carta(String nombre){
		this.nombre=nombre;
	}
	
	
	
	public String getNombre(){
		return nombre;
	}
	
	public String getImagen(){
		return "<img src=\"Cards/" + nombre +  ".png\" alt='Imagen no cargada' width='200' height='200'>";
	}
}
