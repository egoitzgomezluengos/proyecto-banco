package com.curso.Banco_proyecto.dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable{


	private static final long serialVersionUID = 1L;
	
	//variables
	private String dni;
	private String nombre;
	private String apellido;
	private Cuenta cuenta;
	private ArrayList<Cuenta> cuentas ;
	
	//constructor
	public Cliente(String dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		cuentas = new ArrayList<Cuenta>();
		
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
	
	public String getDni() {
		return dni;
	}


	//otros metodos
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + "]" + ", tiene un saldo de " + cuenta.getBalance();
	}
	
	public void aniadirCuenta(Cuenta cuenta) {

		cuentas.add(cuenta);
		
	}
	
	public int getNumCuentas() {
		return cuentas.size(); 
	}

	
	public Cuenta getAccount(int index) {
		
		return cuentas.get(index);
		
	}
	
}
