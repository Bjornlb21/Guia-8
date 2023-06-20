
package main;

import java.util.Scanner;
import main.entidad.CuentaBancaria;
import main.servicio.CuentaBancariaServicio;

public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        
        CuentaBancaria cb = cbs.crearCuenta();
        
        boolean bandera = true;
        
        int opc;
        
        do {
            
            System.out.println("======= Menú =======");
            System.out.println("1: Ingresar saldo");
            System.out.println("2: Retirar saldo");
            System.out.println("3: Extracción rápida");
            System.out.println("4: Consultar saldo");
            System.out.println("5: Consultar datos");
            System.out.println("6: Salir");
            System.out.print(">: ");
            
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    
                    cbs.ingresar(cb);
                    
                    break;
                case 2:
                    
                    cbs.retirar(cb);
                    
                    break;
                case 3:
                    
                    cbs.extraccionRapida(cb);
                    
                    break;
                case 4:
                    
                    cbs.calcularSaldo(cb);
                    
                    break;
                case 5:
                    
                    cbs.consultarDatos(cb);
                    
                    break;
                case 6:
                    
                    System.out.println("");
                    System.out.print("¿Desea salir? S/N: ");
                    
                    if (leer.next().toUpperCase().charAt(0) == 'S' ) {
                        
                        bandera = false;
                    }
                    
                    System.out.println("");
                    
                    break;
            }
            
        } while (bandera);
    }
}
