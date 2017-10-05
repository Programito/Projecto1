package com.projecto.n1.projecto1.domain;

public class Cono implements IntGeometry{
	private static final float PI =3.1416f;
	private float r, h;
	

	public Cono(float r, float h){
		this.r=r;
		this.h=h;
	}
	
	
	@Override
	public float computeArea() {
		 return (PI * r* r) + (PI * r * calcularG());
	}

	@Override
	public float computevolumen() {
		return (PI * r * r*h/3);
	}
	
	
	private float calcularG(){
		return (float) Math.sqrt((h*h)+(r*r)); 
	}


	@Override
	public int getCaras() {
		return 1;
	}


	@Override
	public int getAristas() {
		return 1;
	}


	@Override
	public int getVertices() {
		return 0;
	}

}
