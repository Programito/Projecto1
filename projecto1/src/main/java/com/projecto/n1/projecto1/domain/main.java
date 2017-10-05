package com.projecto.n1.projecto1.domain;

import com.projecto.n1.projecto1.business.Servicios;

public class main {

	public static void main(String[] args) {
			
		
			/*Carta carta;
			Servicios servicios= new Servicios();
			servicios.inicializar();
			int posicion;
			String nombre=servicios.getCarta(5);
			mostrar(servicios);
			System.out.println(nombre);
			int i=servicios.posicion(nombre);
			System.out.println("esta en la posicion: " + i);
			i=calcularPack(i);
			System.out.println("esta en el pack " + i);
			System.out.println("------------------------");
			for(int j=0;j<3;j++){
				servicios.avanzar(i);
				mostrar(servicios);
				i=servicios.posicion(nombre);	
				System.out.println("esta en la posicion: " + i);
				i=calcularPack(i);
				System.out.println("esta en el pack " + i);
				System.out.println("------------------------");
			}
			mostrar(servicios);
			i=servicios.posicion(nombre);
			i=servicios.posicion(nombre);	
			System.out.println("esta en la posicion: " + i);
			i=calcularPack(i);
			System.out.println("esta en el pack " + i);
			servicios.introducir(i);
			System.out.println(servicios.finalizar().getNombre());*/
			
	}
	
	public static void mostrar(Servicios servicios){
		System.out.println(servicios.getCartasColumna(0));
		System.out.println(servicios.getCartasColumna(1));
		System.out.println(servicios.getCartasColumna(2));
	}
	
	public static int calcularPack(int i){
		int posicion=0;
		if(i<7){
			posicion=1;
		}else if(i<14){
			posicion=2;
		}else{
			posicion=3;
		}
		return posicion;
	}
}
