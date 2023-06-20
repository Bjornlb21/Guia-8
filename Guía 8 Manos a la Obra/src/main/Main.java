package main;

import main.entidad.Persona;
import main.servicio.PersonaServicio;

public class Main {

    public static void main(String[] args) {
        
        PersonaServicio ps = new PersonaServicio();
        
        Persona p1 = new Persona("Björn", "Lodbrok", 24);
        
        ps.crearPersona(p1);
    }
}
