package com.curso.Banco_proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import com.curso.Banco_proyecto.dominio.Banco;
import com.curso.Banco_proyecto.dominio.CheckingAccount;
import com.curso.Banco_proyecto.dominio.Cliente;
import com.curso.Banco_proyecto.dominio.SavingsAccount;

public class CargaDatosBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Leer el archivo DatosALeer.txt para crear los clientes del banco
		 * 
		 * Por cada linea leer los datos para crear cliente y su cuenta bancaria
		 * 
		 * si el tipo de cuenta es "C" creamo un CheckingAccount con los 2 ultimos numeros decimales
		 * que se carga en la linea 
		 * 	. el primero es el saldo, el segundo es del limite del credito
		 * 
		 * si el tipo de cuenta es "S" creamos un SavingAccount donde los 2 ultimos numeros decimales
		 * son saldo y el interes
		 * 
		 * USO: Scanner, DateTimeFormatter, FileReader, BufferedReader
		 */
		File miFicheroLectura = new File("DatosALeer.txt");
		FileReader fr = null;
		BufferedReader br= null;
		
		
		try {
			fr = new FileReader(miFicheroLectura);
			br = new BufferedReader(fr);
			
			String linea;
			
			 linea = br.readLine();
			
			 while (linea != null) {
				 Scanner sc = new Scanner(linea);
				 Locale castellano = new Locale("en","US");
				 
				 sc.useLocale(castellano);
				 sc.useDelimiter("#");
				 
				 String dni = sc.next();
				 String nombre = sc.next();
				 String apellido = sc.next();
				 String fecha = sc.next();
				 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				 LocalDate fechaCambiada = LocalDate.parse(fecha, formatter);
				 
				Banco.aniadirCliente(dni, nombre, apellido, fechaCambiada);
				 
				Cliente cliente = Banco.getCustomer(dni);
				
				 String tipoCuenta =  sc.next();
				 
				 if (tipoCuenta.equalsIgnoreCase("S")) {
					 double saldo = sc.nextDouble();
					 double interes = sc.nextDouble();
					 
					 SavingsAccount save = new SavingsAccount(saldo, interes);
					 cliente.aniadirCuenta(save);
				 }else {
					 double saldo = sc.nextDouble();
					 double limite = sc.nextDouble();
					 
					 CheckingAccount check =new CheckingAccount(saldo, limite);
					 cliente.aniadirCuenta(check);
				 }
				 
				 linea= br.readLine();
				 
			 }
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					if(br != null) br.close();
					if(fr != null) fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		Banco.getCustomers();
	}//fin main

}
