package com.projecto.n1.projecto1.test;

import org.junit.Assert;
import org.junit.Test;

import com.projecto.n1.projecto1.domain.Baraja;
import com.projecto.n1.projecto1.domain.Cilindro;

public class BarajaTest {
	@Test
	public void testRepartir(){
		Baraja baraja= new Baraja();
		baraja.repartir();
		Assert.assertEquals("c1",baraja.getCarta(0).getNombre()); 
		Assert.assertEquals("c4",baraja.getCarta(1).getNombre());
		Assert.assertEquals("c3",baraja.getCarta(14).getNombre()); 
		Assert.assertEquals("c7",baraja.getCarta(2).getNombre()); 
	}
	
	@Test
	public void testIntroducir(){
		Baraja baraja= new Baraja();
		baraja.introducir(1);
		Assert.assertEquals("c1",baraja.getCarta(7).getNombre()); 
		Assert.assertEquals("c3",baraja.getCarta(9).getNombre()); 
	}
	
	@Test
	public void getCartasColumna(){
		Baraja baraja= new Baraja();
		
		String salida=baraja.getCartasColumna(0);
		Assert.assertEquals("c1c2c3c4c5c6c7",salida); 
	}
	
	@Test
	public void posicionTest(){
		Baraja baraja= new Baraja();
		String valor=baraja.getCarta(12).getNombre();
		int i= baraja.posicion(valor);
		Assert.assertEquals(12,i); 
	}
	
	
}
