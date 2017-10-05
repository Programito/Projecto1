package com.projecto.n1.projecto1.test;

import org.junit.Assert;
import org.junit.Test;

import com.projecto.n1.projecto1.domain.Cilindro;
import com.projecto.n1.projecto1.domain.Cono;

public class ConoTest {
	@Test
	public void testArea(){
		
		Cono cono= new Cono(2,3); 
		float result=cono.computeArea(); 
		Assert.assertEquals(35.19,result,0.1); 
	}
	
	
	@Test
	public void testVolumen(){
		Cono cono= new Cono(2,3); 
		float result=cono.computevolumen(); 
		Assert.assertEquals(12.57,result,0.1); 
	}
}
