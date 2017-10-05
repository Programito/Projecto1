package com.projecto.n1.projecto1.business;

import java.util.Date;

import javax.ejb.Stateless;

import com.projecto.n1.projecto1.domain.Cilindro;
import com.projecto.n1.projecto1.domain.Cono;
import com.projecto.n1.projecto1.domain.Cubo;
import com.projecto.n1.projecto1.domain.Esfera;
import com.projecto.n1.projecto1.domain.IntGeometry;

@Stateless
public class Greeting {

	private static final String AREA="La Area es: ";
	private static final String VOLUMEN="El volumen es: ";
	private static final String ARISTA="Las aristas son: ";
	private static final String CARAS="Las caras son: ";
	private static final String VERTICES="Los vertices son: ";
	
	public Greeting(){
		System.out.println("Constructor Greeting");
	}
	
	public String getGreeting(String tipo,String radioLado,String altura){
		StringBuilder salida=new StringBuilder();
		IntGeometry intgeo;
		try{
			if(tipo.equals("Esfera") || tipo.equals("Cubo") || tipo.equals("Cono") || tipo.equals("Cilindro")){
				float radioA=Float.parseFloat(radioLado);
				if(tipo.equals("Esfera")){
					intgeo=new Esfera(radioA);
				}else if(tipo.equals("Cilindro")){
					float alt=Float.parseFloat(altura);
					intgeo=new Cilindro(radioA,alt);
				}else if(tipo.equals("Cubo")){
					intgeo=new Cubo(radioA);
				}else{
					float alt=Float.parseFloat(altura);
					intgeo=new Cono(radioA,alt);
				}
				salida.append(ARISTA).append(intgeo.getAristas()).append("<br>");
				salida.append(VERTICES).append(intgeo.getVertices()).append("<br>");
				salida.append(CARAS).append(intgeo.getCaras()).append("<br>");
				salida.append(AREA).append(intgeo.computeArea()).append("<br>");
				salida.append(VOLUMEN).append(intgeo.computevolumen()).append("<br>");
			}
		}catch (NumberFormatException nfe)
		{
			salida.append("Los datos introducidos no son numeros");
	    }
		return salida.toString();
	}
	
	
	
}
