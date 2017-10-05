package com.projecto.n1.projecto1.test;

import org.junit.Assert;
import org.junit.Test;

import com.projecto.n1.projecto1.business.Servicios;
import com.projecto.n1.projecto1.domain.Carta;

public class ServicioTest {
	@Test
	public void Globaltest(){
		Servicios servicios= new Servicios();
		servicios.inicializar();
		String nombre=servicios.getCarta(12);
		int i=servicios.posicion(nombre);
		i=calcularPack(i);
		for(int j=0;j<3;j++){
			servicios.avanzar(i);
			i=servicios.posicion(nombre);	
			i=calcularPack(i);
		}
		i=servicios.posicion(nombre);
		i=servicios.posicion(nombre);	
		i=calcularPack(i);
		servicios.introducir(i);
		Assert.assertEquals(nombre,servicios.finalizar().getNombre()); 
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
