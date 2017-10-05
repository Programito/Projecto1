package com.projecto.n1.projecto1.domain;

import java.util.ArrayList;


public class Baraja {
	private Carta[] cartas;
	
	public Baraja(){
		cartas=new Carta[21];
		
		for(int i=0;i<cartas.length;i++){
			String nombre='c'+ String.valueOf(i+1);
			cartas[i]=new Carta(nombre);
		}
	}
	
	
	public void empezar(){
		cartas=new Carta[21];
			
		/*for(int i=0;i<cartas.length;i++){
			String nombre='c'+ String.valueOf(i+1);
			cartas[i]=new Carta(nombre);
		}*/
		
		conjunto();
			
		iniciar();
			
		repartir();
	}
	
	public void seguirPartida(int lugar){
		Carta card=null;
		
		introducir(lugar);
		repartir();
	}
	
	public Carta devolverCarta(){
		return cartas[10];
	}
	
	public void iniciar(){
		ArrayList<Integer> lista= new ArrayList();
		for(int i=0;i<21;i++){
			lista.add(i);
		}
		
		Carta[] copia=copiar();
		for(int i=0;i<21;i++){
			int num=(int)Math.floor(Math.random()*(lista.size()));
			cartas[i]=copia[lista.get(num)];
			lista.remove(num);
		}
		
	}
	
	public void repartir(){
		Carta[] copia=copiar();
		for(int i=0;i<7;i++){
			cartas[i]=copia[(3*i)];
			cartas[i+7]=copia[1+(3*i)];
			cartas[i+14]=copia[2+(3*i)];
		}
	}
	
	
	
	public void introducir(int lugar){
		if(lugar==1 || lugar==3){
			Carta[] copia1= copiar(0);
			Carta[] copia2= copiar(1);
			Carta[] copia3= copiar(2);
			
			if(lugar==1){
				ordenar(copia2,copia1,copia3);
			}else{
				ordenar(copia1,copia3,copia2);
			}
		}
	}
	
	private void ordenar(Carta[] pack1,Carta[] pack2,Carta[] pack3){
		for(int i=0;i<pack1.length && i<pack2.length && i<pack3.length;i++){
			cartas[i]=pack1[i];
			cartas[i+7]=pack2[i];
			cartas[i+14]=pack3[i];
		}
	}
	
	private Carta[] copiar(int lugar){
		Carta[] copia= new Carta[7];
		for(int i=0;i<copia.length;i++){
			copia[i]=new Carta(cartas[i+lugar*7].getNombre());
		}
		return copia;
	}
	
	private Carta[] copiar(){
		Carta[] copia= new Carta[21];
		for(int i=0;i<copia.length;i++){
			copia[i]=new Carta(cartas[i].getNombre());
		}
		return copia;
	}
	

	
	public Carta getCarta(int pos){
		return cartas[pos];
	}
	
	public Carta[] getPack(int lugar){
		return copiar(lugar);
	}
	
	public String getCartasColumna(int pos){
		String salida="";
		for(int i=0;i<7;i++){
			salida= salida + "" + cartas[i+(pos*7)].getNombre();
		 }		
		return salida;
	}
	
	
	public String getImagenColumna(int pos){
		String salida="";
		for(int i=0;i<7;i++){
			salida = salida + "<img src=\"Cards/" +  cartas[i+(pos*7)].getNombre()+  ".png\" alt='Imagen no cargada' width='100' height='100' style='border:3px solid white;'>";
			
		 }		
		return salida;
	}
	
	
	
	
	public void mostrar(){
		for(int i=0;i<cartas.length;i++){
			System.out.println(cartas[i].getNombre());
		}
	}


	public int posicion(String nombre) {
		boolean buscar=true;
		int i=0;
		while(i<cartas.length && buscar){
			if(cartas[i].getNombre().equals(nombre)){
				buscar=false;
			}
			else{
				i++;
			}
		}
		return i;
	}
	
	private void conjunto(){
		ArrayList<String> conjuntoTotal=new ArrayList();
		for(int i=0;i<53;i++){
			String nombre='c'+ String.valueOf(i);
			conjuntoTotal.add(nombre);
		}
		
		while(conjuntoTotal.size()>21){
			int num=(int)Math.floor(Math.random()*(conjuntoTotal.size()));
			conjuntoTotal.remove(num);
		}
		
		for(int i=0;i<cartas.length;i++){
			String nombre=conjuntoTotal.get(i);
			cartas[i]=new Carta(nombre);
		}
		
	}
	
	
}
