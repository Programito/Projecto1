package com.projecto.n1.projecto1.domain;

public class Esfera implements IntGeometry{
	private static final float PI =3.1416f;
	private float r;  
	
	public Esfera(float r) { 
		this.r=r; 
	}
	
	@Override
	public float computeArea(){
		return 4*PI*r*r; 
	}
	
	@Override
	public float computevolumen() {
		return 4*PI*r*r*r/3;
	}

	@Override
	public int getCaras() {
		return 1;
	}

	@Override
	public int getAristas() {
		return 0;
	}

	@Override
	public int getVertices() {
		return 0;
	}

	
	
	
}