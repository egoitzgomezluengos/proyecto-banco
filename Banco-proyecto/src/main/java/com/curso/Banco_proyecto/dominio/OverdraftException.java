package com.curso.Banco_proyecto.dominio;

public class OverdraftException extends Exception{
	
	private double deficit;

	public OverdraftException(String message, double deficit) {
		super(message);
		this.deficit = deficit;
	}

	public double getDeficit() {
		return deficit;
	}
	
	

}
