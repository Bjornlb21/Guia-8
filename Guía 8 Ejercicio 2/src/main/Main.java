package main;

import java.util.Scanner;
import main.entidad.Cafetera;
import main.servicio.CafeteraServicio;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

        CafeteraServicio cs = new CafeteraServicio();
        
        Cafetera c = new Cafetera();
        
        boolean bandera = true;
        
        do {
            
            System.out.println("");
            System.out.println("======= Menú =======");
            System.out.println("1: Llenar Cafetera");
            System.out.println("2: Agregar Café");
            System.out.println("3: Servir Taza");
            System.out.println("4: Vaciar Cafetera");
            System.out.println("5: Ver cantidad Café");
            System.out.println("6: Salir");
            System.out.print(">: ");
            
            switch (leer.nextInt()) {
                
                case 1:
                    
                    cs.llenarCafetera(c);
                    
                    break;
                case 2:
                    
                    cs.agregarCafe(c);
                    
                    break;
                case 3:
                    
                    cs.servirTaza(c);
                    
                    break;
                case 4:
                    
                    cs.vaciarCafetera(c);
                    
                    break;
                case 5:
                    
                    cs.cantidadCafe(c);
                    
                    break;
                case 6:
                    
                    System.out.println("");
                    System.out.print("¿Desea Salir? S/N: ");
                    
                    if (leer.next().toUpperCase().charAt(0) == 'S') {
                        
                        bandera = false;
                    }
                    
                    break;
            }
            
        } while (bandera);
    }
}
