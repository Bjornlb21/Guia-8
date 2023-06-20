package main.servicio;

import java.util.Scanner;
import main.entidad.Cafetera;

public class CafeteraServicio {
    
    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    // Crear clase CafeteraServicio en el paquete Servicios con los siguiente:

    // Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(Cafetera cafetera) throws InterruptedException {
        
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        
        System.out.println("");
        System.out.println("==== La Cafetera se llenó correctamente ====");
        System.out.println("");
        
    }

    // Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y 
    //    simula la acción de servir la taza con la capacidad indicada. 
    // Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
    // El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
    public void servirTaza(Cafetera cafetera) {
        
        System.out.println("");
        System.out.println("======== Servir Taza de Café ========");
        System.out.println("");
        
        System.out.print("Ingrese el tamaño de la Taza: ");
        int taza = leer.nextInt();
        
        if (taza > cafetera.getCantidadActual()) {
            
            System.out.println("");
            System.out.println("Canticad insuficiente, se le sirvió: [" + cafetera.getCantidadActual() + "]ml de Café.");
            cafetera.setCantidadActual(0);
            
        } else {
        
            System.out.println("");
            System.out.println("Se le sirvió [" + taza + "]ml de Café.");
            
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
        }
        
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("");
    }
    
    // Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    public void vaciarCafetera(Cafetera cafetera) {
        
        cafetera.setCantidadActual(0);
        
        System.out.println("");
        System.out.println("====== la Cafetera se vació correctamente ======");
        System.out.println("");
    }
    
    // Método agregarCafe(int): se le pide al usuario una cantidad de café, 
    //   el método lo recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(Cafetera cafetera) {
        
        System.out.println("");
        System.out.println("====== Agregar Café ======");
        System.out.println("");
        
        System.out.print("Ingrese la Cantidad de Café: ");
        int cantidad = leer.nextInt();
        
        cafetera.setCantidadActual(cantidad);
        
        System.out.println("");
        System.out.println("==========================");
        System.out.println("");
    }
    
    // Creé este método para verificar cuánta cantidad de café queda en la Cafetera.
    public void cantidadCafe(Cafetera cafetera) {
    
        System.out.println("");
        System.out.println("===== Verificar la cantidad de Café disponible =====");
        System.out.println("");
        
        System.out.println("Café disponible en la Cafetera es de: [" + cafetera.getCantidadActual() + "]ml.");
        
        System.out.println("");
        System.out.println("====================================================");
        System.out.println("");
    }
}
