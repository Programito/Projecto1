package com.projecto.n1.projecto1.test;

import org.junit.Assert;
import org.junit.Test;

import com.projecto.n1.projecto1.domain.Cilindro;
import com.projecto.n1.projecto1.domain.Esfera;

public class CilindroTest {
	@Test
	public void testArea(){
		
		Cilindro cilindro= new Cilindro(2,3); 
		float result=cilindro.computeArea(); 
		Assert.assertEquals(62.83,result,0.1); 
	}
	
	
	@Test
	public void testVolumen(){
		
		Cilindro cilindro= new Cilindro(2,3); 
		float result=cilindro.computevolumen(); 
		Assert.assertEquals(37.7,result,0.1); 
	}
}
