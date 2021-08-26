package com.curso.Banco_proyecto.dominio;

import java.io.Serializable;

public class Cuenta  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	//variables
	protected double balance;

	//constructor
	protected Cuenta(double balance) {
		super();
		this.balance = balance;
	}

	//metodos getter y setter 
	public double getBalance() {
		return balance;
	}
	
	//otros metodos
	
	public void ingresar(double cantidad) {
		
			this.balance += cantidad;

	}
	
	
	public void retirar(double cantidad) throws OverdraftException {
		
		if( (cantidad > this.balance) || (cantidad == 0) ) {
			throw new OverdraftException("fondos insuficientes", cantidad-this.balance);
		}else {
			this.balance = this.balance - cantidad;

		}

	}
	
}
