package com.curso.Banco_proyecto.dominio;

public class SavingsAccount extends Cuenta{

	private double interestRate;

	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	
}
