package com.projecto.n1.projecto1.test;

import org.junit.Assert;
import org.junit.Test;

import com.projecto.n1.projecto1.domain.Cubo;

public class CuboTest {
	
	
	@Test
	public void testArea(){
		
		Cubo cubo= new Cubo(2); 
		float result=cubo.computeArea(); 
		Assert.assertEquals(24,result,0.1); 
	}
	

	@Test
	public void testVolumen(){
		
		Cubo cubo= new Cubo(2); 
		float result=cubo.computevolumen(); 
		Assert.assertEquals(8,result,0.1); 
	}
	
}
