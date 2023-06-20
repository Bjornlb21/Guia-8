package main.servicio;

import java.util.Scanner;
import main.entidad.Persona;

public class PersonaServicio {

    // Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario 
    //    y después se le asignan a sus respectivos atributos para llenar el objeto Persona. 
    // Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
    // Si no es correcto se deberá mostrar un mensaje
    public Persona crearPersona() {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        Persona p = new Persona();
        
        System.out.println("======== Crear Persona ========");
        System.out.println("");
        
        System.out.print("Ingrese su Nombre: ");
        p.setNombre(leer.next());
        
        System.out.println("");
        
        System.out.print("Ingrese su Edad: ");
        p.setEdad(leer.nextInt());
        
        System.out.println("");
        
        System.out.print("Ingrese su Sexo (H, M u O): ");
        p.setSexo(leer.next().toUpperCase().charAt(0));
        
        while (p.getSexo() != 'H' && p.getSexo() != 'M' && p.getSexo() != 'O') {    
            
            System.out.println("");
            System.out.print("Sexo inválido >: ");
            p.setSexo(leer.next().toUpperCase().charAt(0));
            
        }
        
        System.out.println("");
        
        System.out.print("Ingrese su Altura: ");
        p.setAltura(leer.nextDouble());
        
        System.out.println("");
        
        System.out.print("Ingrese su Peso: ");
        p.setPeso(leer.nextInt());
        
        System.out.println("");
        System.out.println("===============================");
        System.out.println("");
        
        return p;
    }
    
    // Método esMayorDeEdad(): indica si la persona es mayor de edad. 
    // La función devuelve un booleano.
    public boolean esMayorDeEdad(Persona p) {
        
        return p.getEdad() >=18;
    }
    
    // Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
    // Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal 
    //     y la función devuelve un -1. 
    // Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal
    //     y la función devuelve un 0.
    // Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, 
    //     y la función devuelve un 1.
    
    public int calcularIMC(Persona p) {

        double pesoIdeal = p.getPeso() / (Math.pow(p.getAltura(), 2));

        if (pesoIdeal < 20) {

            return -1;
            
        } else if (pesoIdeal >= 20 && pesoIdeal <= 25) {

            return 0;

        } else {

            return 1;
        }
    }
}
