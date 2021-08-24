package com.curso.Banco_proyecto.dominio;

import java.io.Serializable;

public class Cuenta  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	//variables
	private double balance;

	//constructor
	public Cuenta(double balance) {
		super();
		this.balance = balance;
	}

	//metodos getter y setter 
	public double getBalance() {
		return balance;
	}
	
	//otros metodos
	
	public boolean ingresar(double cantidad) {
		
		boolean resultado = false;
		
		if(cantidad <= 0 ) {
			//throw exception
			System.out.println("no puede ingresar una cantidad negativa o 0");
		}else {
			this.balance += cantidad;
			resultado = true;
		}
		
		return resultado;
		
	}
	
	public boolean retirar(double cantidad) {
		
		boolean resultado = false;
		
		if( (cantidad > this.balance) || (cantidad == 0) ) {
			//throw exception
			System.out.println("no puede retirar una cantidad superior a lo que tiene en la cuenta o 0");
		}else {
			this.balance = this.balance - cantidad;
			resultado = true;
		}
		
		return resultado;
	}
	
}
