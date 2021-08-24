package com.curso.Banco_proyecto.dominio;

import java.io.Serializable;

public class Cliente implements Serializable{


	private static final long serialVersionUID = 1L;
	
	//variables
	private String nombre;
	private String apellido;
	private Cuenta cuenta;
	
	//constructor
	public Cliente(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	//metodos getter y setter
	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}


	//otros metodos
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + "]" + ", tiene un saldo de " + cuenta.getBalance();
	}
	
	

	
}
