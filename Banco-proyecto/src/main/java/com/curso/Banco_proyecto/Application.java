package com.curso.Banco_proyecto;

import com.curso.Banco_proyecto.dominio.CheckingAccount;
import com.curso.Banco_proyecto.dominio.Cliente;
import com.curso.Banco_proyecto.dominio.Cuenta;
import com.curso.Banco_proyecto.dominio.SavingsAccount;

public class Application
{
	public static void main( String[] args )
	{
		
		//cliente 1
		Cliente cliente = new Cliente("Egoitz", "Gomez");
		SavingsAccount save1 = new SavingsAccount(500.0, 0);
		CheckingAccount check1 = new CheckingAccount(200.0);
		cliente.aniadirCuenta(save1);
		cliente.aniadirCuenta(check1);
		
		
		//cliente 2
		Cliente cliente2 = new Cliente("Owen", "Bryant");
		CheckingAccount check2 = new CheckingAccount(200.0);
		cliente2.aniadirCuenta(check2);
		
		//cliente 3
		Cliente cliente3 = new Cliente("Tim", "Soley");
		SavingsAccount save3 = new SavingsAccount(1500.0, 0);
		CheckingAccount check3 = new CheckingAccount(200.0);
		cliente3.aniadirCuenta(save3);
		cliente3.aniadirCuenta(check3);
		
		//cliente 4
		Cliente cliente4 = new Cliente("Maria", "Soley");
		SavingsAccount save4 = new SavingsAccount(150.0, 0);
		cliente4.aniadirCuenta(save4);
		cliente4.aniadirCuenta(check3);
		
		System.out.println("CUSTOMERS REPORT");
		System.out.println("=================");
		
		System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
		System.out.println("Cuenta de ahorros: el balance actual es de " + cliente.getAccount(0).getBalance());
		System.out.println("Cuenta Corriente: el balance actual es de " + cliente.getAccount(1).getBalance());
		System.out.println("");
		
		System.out.println("Cliente: " + cliente2.getNombre() + " " + cliente2.getApellido());
		System.out.println("Cuenta Corriente: el balance actual es de " + cliente2.getAccount(0).getBalance());
		System.out.println("");
		
		System.out.println("Cliente: " + cliente3.getNombre() + " " + cliente3.getApellido());
		System.out.println("Cuenta de ahorros: el balance actual es de " + cliente3.getAccount(0).getBalance());
		System.out.println("Cuenta Corriente: el balance actual es de " + cliente3.getAccount(1).getBalance());
		System.out.println("");
		
		System.out.println("Cliente: " + cliente4.getNombre() + " " + cliente4.getApellido());
		System.out.println("Cuenta de ahorros: el balance actual es de " + cliente4.getAccount(0).getBalance());
		System.out.println("Cuenta Corriente: el balance actual es de " + cliente4.getAccount(1).getBalance());
		System.out.println("");
		
	}
	

	
	
}