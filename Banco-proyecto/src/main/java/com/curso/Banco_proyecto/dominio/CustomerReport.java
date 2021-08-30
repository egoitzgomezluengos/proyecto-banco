package com.curso.Banco_proyecto.dominio;

public class CustomerReport {
	
//	public void TestReport() {
//		System.out.println("Reporte de clientes");
//        System.out.println("====================");
//        
//        for ( int numCliente = 0; numCliente < Banco.getNumClientes();numCliente++ ) {
//            Cliente cliente = Banco.getCustomer(numCliente);
//            
//            System.out.println("Cliente: "+ cliente.getNombre() + " " + cliente.getApellido());
//            
//            for ( int numCuenta = 0; numCuenta < cliente.getNumCuentas(); numCuenta++ ) {
//                Cuenta cuenta = cliente.getAccount(numCuenta);
//                String  tipoCuenta = "";
//
//                if ( cuenta instanceof SavingsAccount ) {
//                	tipoCuenta = "Cuenta de ahorros";
//                } else if ( cuenta instanceof CheckingAccount ) {
//                	tipoCuenta = "Cuenta corriente";
//                } else {
//                	tipoCuenta = "tipo desconocido en este banco";
//                }
//
//                System.out.println(tipoCuenta + ": el balance actual de la cuenta es "+ cuenta.getBalance());
//                
//            }
//            System.out.println("");
//        }
//	}

//    public void generateReport() {
//        
//    	System.out.println("Reporte de clientes");
//        System.out.println("====================");
//        
//        for ( int numCliente = 0; numCliente < Banco.getNumClientes();numCliente++ ) {
//            Cliente cliente = Banco.getCustomer(numCliente);
//            
//            System.out.println("Cliente: "+ cliente.getNombre() + " " + cliente.getApellido());
//            
//            for ( int numCuenta = 0; numCuenta < cliente.getNumCuentas(); numCuenta++ ) {
//                Cuenta cuenta = cliente.getAccount(numCuenta);
//                String  tipoCuenta = "";
//
//                if ( cuenta instanceof SavingsAccount ) {
//                	tipoCuenta = "Cuenta de ahorros";
//                } else if ( cuenta instanceof CheckingAccount ) {
//                	tipoCuenta = "Cuenta corriente";
//                } else {
//                	tipoCuenta = "tipo desconocido en este banco";
//                }
//                
//                
//                System.out.println(tipoCuenta + ": el balance actual de la cuenta es "+ cuenta.getBalance());
//                
//            }
//            System.out.println("");
//        }
//    }
    
//    public void TestBanking() {
//    	
//        for ( int numCliente = 0; numCliente < Banco.getNumClientes();numCliente++ ) {
//            Cliente cliente = Banco.getCustomer(numCliente);
//
//            Cuenta cuenta = cliente.getAccount(0);
//            
//            String  tipoCuenta = "";
//
//            if ( cuenta instanceof SavingsAccount ) {
//            	tipoCuenta = "Cuenta de ahorros";
//            } else if ( cuenta instanceof CheckingAccount ) {
//            	tipoCuenta = "Cuenta corriente";
//            } else {
//            	tipoCuenta = "tipo desconocido en este banco";
//            }
//            
//            try {
//            	if(cuenta instanceof SavingsAccount) {
//               	 	System.out.println(tipoCuenta + " [" + cliente.getNombre() + " " + cliente.getApellido() + "] : retira 100.00");
//               	 	cuenta.retirar(100.00);
//                    System.out.println(tipoCuenta + " [" + cliente.getNombre() + " " + cliente.getApellido() + "] : ingresa 25.00");
//                    cuenta.ingresar(25.00);
//                    System.out.println(tipoCuenta + " [" + cliente.getNombre() + " " + cliente.getApellido() + "] : retira 175.00");
//                    cuenta.retirar(175.00);
//                   
//            	}else {
//               	 	System.out.println(tipoCuenta + " [" + cliente.getNombre() + " " + cliente.getApellido() + "] : retira 150.00");
//               	 	cuenta.retirar(150);
//                    System.out.println(tipoCuenta + " [" + cliente.getNombre() + " " + cliente.getApellido() + "] : ingresa 22.50");
//                    cuenta.ingresar(22.50);
//                    System.out.println(tipoCuenta + " [" + cliente.getNombre() + " " + cliente.getApellido() + "] : retira 147.62");
//                    cuenta.retirar(147.62);
//                    System.out.println(tipoCuenta + " [" + cliente.getNombre() + " " + cliente.getApellido() + "] : retira 470.00");
//                    cuenta.retirar(470.00);
//                   
//            	}
//
//            	
//            }catch (OverdraftException e){
//            	System.out.println("Fondos insuficiente. Deficit " + e.getDeficit());
//            	 System.out.println("cliente " + " [" + cliente.getNombre() + " " + cliente.getApellido() + "] tiene un balance de " + cuenta.getBalance());
//            }
//
//             
//            
//        }
//   }
}
//
