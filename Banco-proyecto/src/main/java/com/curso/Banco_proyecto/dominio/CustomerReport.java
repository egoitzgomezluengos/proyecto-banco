package com.curso.Banco_proyecto.dominio;

public class CustomerReport {
	
	public void TestReport() {
		System.out.println("Reporte de clientes");
        System.out.println("====================");
        
        for ( int numCliente = 0; numCliente < Banco.getNumClientes();numCliente++ ) {
            Cliente cliente = Banco.getCustomer(numCliente);
            
            System.out.println("Cliente: "+ cliente.getNombre() + " " + cliente.getApellido());
            
            for ( int numCuenta = 0; numCuenta < cliente.getNumCuentas(); numCuenta++ ) {
                Cuenta cuenta = cliente.getAccount(numCuenta);
                String  tipoCuenta = "";

                if ( cuenta instanceof SavingsAccount ) {
                	tipoCuenta = "Cuenta de ahorros";
                } else if ( cuenta instanceof CheckingAccount ) {
                	tipoCuenta = "Cuenta corriente";
                } else {
                	tipoCuenta = "tipo desconocido en este banco";
                }

                System.out.println(tipoCuenta + ": el balance actual de la cuenta es "+ cuenta.getBalance());
                
            }
            System.out.println("");
        }
	}

    public void generateReport() {
        
    	System.out.println("Reporte de clientes");
        System.out.println("====================");
        
        for ( int numCliente = 0; numCliente < Banco.getNumClientes();numCliente++ ) {
            Cliente cliente = Banco.getCustomer(numCliente);
            
            System.out.println("Cliente: "+ cliente.getNombre() + " " + cliente.getApellido());
            
            for ( int numCuenta = 0; numCuenta < cliente.getNumCuentas(); numCuenta++ ) {
                Cuenta cuenta = cliente.getAccount(numCuenta);
                String  tipoCuenta = "";

                if ( cuenta instanceof SavingsAccount ) {
                	tipoCuenta = "Cuenta de ahorros";
                } else if ( cuenta instanceof CheckingAccount ) {
                	tipoCuenta = "Cuenta corriente";
                } else {
                	tipoCuenta = "tipo desconocido en este banco";
                }
                
                
                System.out.println(tipoCuenta + ": el balance actual de la cuenta es "+ cuenta.getBalance());
                
            }
            System.out.println("");
        }
    }
}

