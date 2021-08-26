package com.curso.Banco_proyecto.dominio;

public class CheckingAccount extends Cuenta{
	

	//variables 
	private double overdraftAmount;

	//Constructores
	public CheckingAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
		this.overdraftAmount = 0.0;
	}

	public CheckingAccount(double balance, double overdraftAmount) {
		super(balance);
		this.overdraftAmount = overdraftAmount;
	}
	
	//otros metodos
	@Override
	public boolean retirar(double amount) {
		 boolean resultado = true;
		 
		 if (balance < amount) {
			 double overdraftNeeded = amount - balance;
			 if(overdraftAmount < overdraftNeeded) {
				 resultado = false;
			 }else {
				 balance = 0.0;
				 overdraftAmount = overdraftAmount - overdraftNeeded;
			 }
		 }else {
			 balance = balance - amount;
		 }
		 
		 return resultado;
	}
	
	

}
