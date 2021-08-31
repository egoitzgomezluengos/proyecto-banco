package com.curso.Banco_proyecto;

import java.time.LocalDate;

import com.curso.Banco_proyecto.dominio.Banco;
import com.curso.Banco_proyecto.dominio.CheckingAccount;
import com.curso.Banco_proyecto.dominio.Cliente;
//import com.curso.Banco_proyecto.dominio.CustomerReport;
//import com.curso.Banco_proyecto.dominio.OverdraftException;
import com.curso.Banco_proyecto.dominio.SavingsAccount;

public class Application
{
	public static void main( String[] args )
	{
		
		Banco.aniadirCliente("16092745J","Egoitz", "Gomez", LocalDate.now());
		Banco.aniadirCliente("16092744N","Owen", "Bryant", LocalDate.now());
//		Banco.aniadirCliente("Tim", "Soley");
//		Banco.aniadirCliente("Maria", "Soley");
		
//		//cliente 1
//		Cliente cliente = Banco.getCustomer(0);
//		SavingsAccount save1 = new SavingsAccount(500.0, 0);
//		CheckingAccount check1 = new CheckingAccount(200.0);
//		cliente.aniadirCuenta(save1);
//		cliente.aniadirCuenta(check1);
//		
//		
//		//cliente 2
//		Cliente cliente2 =  Banco.getCustomer(1);
//		CheckingAccount check2 = new CheckingAccount(200.0);
//		cliente2.aniadirCuenta(check2);
//		
//		//cliente 3
//		Cliente cliente3 = Banco.getCustomer(2);
//		SavingsAccount save3 = new SavingsAccount(1500.0, 0);
//		CheckingAccount check3 = new CheckingAccount(200.0);
//		cliente3.aniadirCuenta(save3);
//		cliente3.aniadirCuenta(check3);
//		
//		//cliente 4
//		Cliente cliente4 = Banco.getCustomer(3);
//		SavingsAccount save4 = new SavingsAccount(150.0, 0);
//		cliente4.aniadirCuenta(save4);
//		cliente4.aniadirCuenta(check3);
		

		Cliente cliente = Banco.getCustomer("16092745J");
		CheckingAccount check1 = new CheckingAccount(200.0,500.00);
		SavingsAccount save2 = new SavingsAccount(500.0, 0);
		cliente.aniadirCuenta(check1);
		cliente.aniadirCuenta(save2);
		 
		Cliente cliente2 = Banco.getCustomer("16092744N");
		SavingsAccount save1 = new SavingsAccount(200.0, 0);
		cliente2.aniadirCuenta(save1);
		
		
		Banco.getCustomers();
		
		//CustomerReport test = new CustomerReport();
		
		//test.TestReport();
		
		//test.generateReport();
		
		//test.TestBanking();

	}
	


	
	
}