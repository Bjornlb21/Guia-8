package main.servicio;

import main.entidad.Raices;

public class RaicesServicio {

    // Método getDiscriminante(): devuelve el valor del discriminante (double). 
    // El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    
    public double getDiscriminante(Raices r) {
    
        return (Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC());
    }
    
    // Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, 
    //    el discriminante debe ser mayor o igual que 0.
    
    public boolean tieneRaices(Raices r) {
    
        return getDiscriminante(r) >= 0;
    }
    
    // Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, 
    //    el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Raices r) {
        
        return getDiscriminante(r) == 0;
    }
    
    // Método obtenerRaices(): llama a tieneRaices() y si devolvió true, imprime las 2 posibles soluciones.
    
    public void obtenerRaices(Raices r) {

        double solucion1 = ((-r.getB() + Math.sqrt(getDiscriminante(r))) / (2 * r.getA()));

        System.out.println("Primera solución: [" + solucion1 + "].");

        double solucion2 = ((-r.getB() - Math.sqrt(getDiscriminante(r))) / (2 * r.getA()));

        System.out.println("Segunda solución: [" + solucion2 + "].");
    }

    // Método obtenerRaiz(): llama a tieneRaiz() y si devolvió true imprime una única raíz. 
    // Es en el caso en que se tenga una única solución posible.
    
    public void obtenerRaiz(Raices r) {

        double unicaSolucion = (-r.getB()) / (2 * r.getA());

        System.out.println("Única solución: [" + unicaSolucion + "].");
    }
    
    // Método calcular(): esté  método llamará a tieneRaices() y a tieneRaíz(), 
    //   y mostrará  por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() 
    //   u obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
    
    public void calcular(Raices r) {
        
        if (tieneRaices(r)) {
            
            obtenerRaices(r);
            
        } else if (tieneRaiz(r)) {
            
            obtenerRaiz(r);
            
        } else {
        
            System.out.println("");
            System.out.println("La Ecuación no tiene ninguna solución.");
        }
    }
}
