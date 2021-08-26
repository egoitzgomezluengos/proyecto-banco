package com.curso.Banco_proyecto.dominio;

public class Banco {

	private static Cliente[] clientes;
	private static int numClientes;
	
	static {
		clientes = new Cliente[5];
		numClientes = 0;
	}
	
	private Banco() {
		
	}
	
	public static void aniadirCliente(String nombre, String apellido) {
		int i = numClientes;
		clientes[i] = new Cliente(nombre, apellido);
		numClientes++;
	}
	
	public static int getNumClientes() {
		return numClientes;
	}
	
	public static Cliente getCustomer(int index) {
		return clientes[index];
	}
	
}
