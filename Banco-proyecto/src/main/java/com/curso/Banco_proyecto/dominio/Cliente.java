package com.curso.Banco_proyecto.dominio;

import java.io.Serializable;

public class Cliente implements Serializable{


	private static final long serialVersionUID = 1L;
	
	//variables
	private String nombre;
	private String apellido;
	private Cuenta cuenta;
	private Cuenta[] cuentas;
	private int numeroCuentas;
	
	//constructor
	public Cliente(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		cuentas = new Cuenta[5];
		numeroCuentas = 0;
	}

	//metodos getter y setter
	public Cuenta getCuenta() {
		return cuenta;
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
	
	public void aniadirCuenta(Cuenta cuenta) {
		int i = numeroCuentas;
		cuentas[i] = cuenta;
		numeroCuentas++;
	}
	
	public int getNumCuentas() {
		return numeroCuentas;
	}

	
	public Cuenta getAccount(int index) {
		
		return cuentas[index];
		
	}
	
}
