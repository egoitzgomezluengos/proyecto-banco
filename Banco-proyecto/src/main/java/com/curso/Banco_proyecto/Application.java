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
		System.out.println("Creado el cliente " + cliente.getNombre() + " " + cliente.getApellido());
		
		SavingsAccount save1 = new SavingsAccount(500.0, 3);
		System.out.println("Creando su cuenta de ahorros con 500.0€ y un interes del 3%");
		
		cliente.setCuenta(save1);
		
		//cliente 2
		Cliente cliente2 = new Cliente("Owen", "Bryant");
		System.out.println("Creado el cliente " + cliente2.getNombre() + " " + cliente2.getApellido());
		
		CheckingAccount check2 = new CheckingAccount(500.0);
		System.out.println("Creando su cuenta corriente con 500.0€ ");
		
		cliente2.setCuenta(check2);
		
		//cliente 3
		Cliente cliente3 = new Cliente("Tim", "Soley");
		System.out.println("Creado el cliente " + cliente3.getNombre() + " " + cliente3.getApellido());
		
		CheckingAccount check3 = new CheckingAccount(500.0, 500.0);
		System.out.println("Creando su cuenta corriente con 500.0€ y un descubierto de 500.0");
		
		cliente3.setCuenta(check3);
		//cliente 4
		Cliente cliente4 = new Cliente("Maria", "Soley");
		System.out.println("Creado el cliente " + cliente4.getNombre() + " " + cliente4.getApellido());
		System.out.println("Comparte cuenta con su marido Tim");
		
		cliente4.setCuenta(check3);
		
		//Pruebas con los clientes
		System.out.println("realizando los movimientos de la cuenta de " + cliente.getNombre() + " " + cliente.getApellido());
		System.out.println("retirando 150.00: " + save1.retirar(150.0));
		System.out.println("ingresando 22.50: " + save1.ingresar(22.50));
		System.out.println("retirando 47.62: " + save1.retirar(47.62));
		System.out.println("retirando 400.00: " + save1.retirar(400.0));
		System.out.println(cliente.toString());
		
		System.out.println("");
		
		System.out.println("realizando los movimientos de la cuenta de " + cliente2.getNombre() + " " + cliente2.getApellido());
		System.out.println("retirando 150.00: " + check2.retirar(150.0));
		System.out.println("ingresando 22.50: " + check2.ingresar(22.50));
		System.out.println("retirando 47.62: " + check2.retirar(47.62));
		System.out.println("retirando 400.00: " + check2.retirar(400.0));
		System.out.println(cliente2.toString());
		
		
		System.out.println("");
		
		System.out.println("realizando los movimientos de la cuenta de " + cliente3.getNombre() + " " + cliente3.getApellido());
		System.out.println("retirando 150.00: " + check3.retirar(150.0));
		System.out.println("ingresando 22.50: " + check3.ingresar(22.50));
		System.out.println("retirando 47.62: " + check3.retirar(47.62));
		System.out.println("retirando 400.00: " + check3.retirar(400.0));
		System.out.println(cliente3.toString());
		
		
		System.out.println("");
		
		System.out.println("realizando los movimientos de la cuenta de " + cliente4.getNombre() + " " + cliente4.getApellido());
		System.out.println("ingresando 150.00: " + check3.ingresar(150.0));
		System.out.println("retirando 750.00: " + check3.retirar(750.0));
		
		System.out.println(cliente4.toString());
		
	}
}