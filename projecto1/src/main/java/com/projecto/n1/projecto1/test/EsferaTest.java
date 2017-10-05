package com.projecto.n1.projecto1.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.projecto.n1.projecto1.domain.Esfera;



public class EsferaTest {
	
	
	
	@Test
	public void testArea(){
		
		Esfera esfera= new Esfera(2); 
		float result=esfera.computeArea(); 
		Assert.assertEquals(50.265,result,0.1); 
	}
	
	
	@Test
	public void testVolumen(){
		
		Esfera esfera= new Esfera(2); 
		float result=esfera.computevolumen(); 
		Assert.assertEquals(33.51,result,0.1); 
	}
	
	
}
