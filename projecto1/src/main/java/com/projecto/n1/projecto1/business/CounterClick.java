package com.projecto.n1.projecto1.business;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class CounterCliclk
 */
@Stateful
@LocalBean
public class CounterClick {

	private int clicks; 
	
    /**
     * Default constructor. 
     */
    public CounterClick() {
    	System.out.println("Constructor CounterCliclk");
    }
    
    public void doClick(){
    	clicks++; 
    }    
    public int getClicks(){
    	return clicks; 
    }
    
}