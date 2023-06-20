package main.servicio;

import java.util.Scanner;
import main.entidad.CuentaBancaria;

public class CuentaBancariaServicio {

    private final Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    // Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
    
    // Método para crear cuenta pidiéndole los datos al usuario.
    public CuentaBancaria crearCuenta() {
        
        CuentaBancaria cb = new CuentaBancaria();
        
        System.out.println("===== Crear Cuenta Bancaria =====");
        System.out.println("");
        
        System.out.print("Ingrese su número de Cuenta: ");
        cb.setNumeroCuenta(leer.nextInt());

        System.out.println("");
        
        System.out.print("Ingrese su número de Documento: ");
        cb.setDniCliente(leer.nextLong());
        
        System.out.println("");
        
        System.out.print("Ingrese el saldo disponible: ");
        cb.setSaldoActual(leer.nextDouble());
        
        System.out.println("");
        System.out.println("=================================");
        System.out.println("");
        
        return cb;
    }
    
    // Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    public void ingresar(CuentaBancaria cb) {
        
        System.out.println("");
        System.out.println("============== Ingresar Dinero ==============");
        System.out.println("");
        
        System.out.print("¿Cuánto dinero desea ingresar a su Cuenta?: ");
        double dinero = leer.nextDouble();
        
        System.out.println("");
        
        cb.setSaldoActual(cb.getSaldoActual() + dinero);
        
        System.out.println("============================================");
        System.out.println("");
    }
    
    // Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
    //    Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    public void retirar(CuentaBancaria cb) {
        
        System.out.println("");
        System.out.println("============== Retirar Dinero ==============");
        System.out.println("");
    
        System.out.print("Ingrese la cantidad de dinero a retirar: ");
        double retirar = leer.nextDouble();
        
        if (retirar > cb.getSaldoActual()) {
            
            System.out.println("");
            System.out.println("No hay fondos suficientes, se retiró: [$" + cb.getSaldoActual() + "].");
            
            cb.setSaldoActual(0);
            
        } else {
        
            System.out.println("Se retiró: [$" + retirar + "] de la Cuenta." );
            cb.setSaldoActual(cb.getSaldoActual() - retirar);
        }
        
        System.out.println("");
        System.out.println("============================================");
        System.out.println("");
    }
    
    // Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. 
    //    Validar que el usuario no saque más del 20%.
    public void extraccionRapida(CuentaBancaria cb) {
        
        System.out.println("");
        System.out.println("========== Extracción Rápida =========");
        System.out.println("");

        if (cb.getSaldoActual() < 1) {

            System.out.println("[Saldo insuficiente]");
            System.out.println("");

            cb.setSaldoActual(0);

        } else {

            System.out.println("Se retiró el 20%: [$" + (cb.getSaldoActual() * 0.2) + "].");
            System.out.println("");
            cb.setSaldoActual(cb.getSaldoActual() * 0.8);

        }

        System.out.println("======================================");
        System.out.println("");
    }
    
    // Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    public void calcularSaldo(CuentaBancaria cb) {
    
        System.out.println("");
        System.out.println("======== Consultar Saldo ========");
        System.out.println("");
    
        System.out.println("Su saldo disponible es de: [$" + cb.getSaldoActual() + "].");
        
        System.out.println("");
        System.out.println("=================================");
        System.out.println("");
    }
    
    // Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    public void consultarDatos(CuentaBancaria cb) {
    
        System.out.println("");
        System.out.println("======== Datos de la Cuenta ========");
        System.out.println("");
        
        System.out.println("Número de Cuenta: [" + cb.getNumeroCuenta() + "].");
        System.out.println("Número de Documento: [" + cb.getDniCliente() + "].");
        System.out.println("Saldo Disponible: [$" + cb.getSaldoActual() + "].");
        
        System.out.println("");
        System.out.println("====================================");
        System.out.println("");
    }
}
