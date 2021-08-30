package com.curso.Banco_proyecto.dominio;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Banco {

	private static Map<String, Cliente> clientes ;
	
	static {
		clientes = new HashMap<String, Cliente>();

	}
	
	private Banco() {
		
	}
	
	public static void aniadirCliente(String dni, String nombre, String apellido) {

		clientes.put(dni, new Cliente(dni, nombre, apellido));

	}
	
	public static int getNumClientes() {
		return clientes.size();
	}
	
	public static Cliente getCustomer(String dni) {
		Cliente clien = clientes.get(dni);
		return clien;
 
	}
	
	public static void getCustomers() {
		 Set<String> claves = clientes.keySet();
	     for(String k: claves){
	    	 int cuentas = clientes.get(k).getNumCuentas();
	    	 	for (int cuenta = 0; cuenta<cuentas; cuenta++) {
	    	 		System.out.println(k  + " -> " + clientes.get(k).getNombre() + " " + clientes.get(k).getApellido() + " " + clientes.get(k).getAccount(cuenta).getBalance());
	    	 	}
	            
	        }

	}
	
}