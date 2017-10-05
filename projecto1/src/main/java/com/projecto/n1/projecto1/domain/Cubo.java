package com.projecto.n1.projecto1.domain;

public class Cubo implements IntGeometry {
	float a;

	public Cubo(float a){
		this.a=a;
	}
	
	@Override
	public float computeArea() {
		return 6*a*a;
	}

	@Override
	public float computevolumen(){
		return a*a*a;
	}

	@Override
	public int getCaras() {
		return 6;
	}

	@Override
	public int getAristas() {
		return 12;
	}

	@Override
	public int getVertices() {
		return 8;
	}

}
