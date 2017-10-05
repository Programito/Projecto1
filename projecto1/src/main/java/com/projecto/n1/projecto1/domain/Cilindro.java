package com.projecto.n1.projecto1.domain;

public class Cilindro implements IntGeometry{
	private static final float PI =3.1416f;
	float r,h;
	
	public Cilindro(float r,float h){
		this.r=r;
		this.h=h;
	}

	@Override
	public float computeArea() {
		return 2* PI *r *(h+r);
	}

	@Override
	public float computevolumen() {
		return PI* r * r * h;
	}

	@Override
	public int getCaras() {
		return 3;
	}

	@Override
	public int getAristas() {
		return 2;
	}

	@Override
	public int getVertices() {
		return 0;
	}


}
