package com.curso.Banco_proyecto;

import com.curso.Banco_proyecto.dominio.Cliente;
import com.curso.Banco_proyecto.dominio.Cuenta;

public class Application
{
	public static void main( String[] args )
	{
		Cliente cliente = new Cliente("Egoitz", "Gomez");

		
		System.out.println("Creado el cliente " + cliente.getNombre() + " " + cliente.getApellido());
		
		Cuenta cuenta = new Cuenta(500.00);
		cliente.setCuenta(cuenta);
		
		System.out.printf("Creada su cuenta bancaria con saldo de %f %n", cuenta.getBalance());
		
		System.out.println("Sacar 150.00: " + cuenta.retirar(150.0));
		
		System.out.println("Ingresar 22.50" + cuenta.ingresar(22.50));
		
		System.out.println("Sacar 47.62: " + cuenta.retirar(47.62));
		
		System.out.println("Sacar 400.00: " + cuenta.retirar(400.0));
		
		System.out.println(cliente.toString());
		
	}
}