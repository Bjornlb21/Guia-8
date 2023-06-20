package main.servicio;

import main.entidad.Persona;

public class PersonaServicio {
    
    // Crea un método void que reciba un objeto tipo persona como parámetro y utilice el get para mostrar sus atributos.
    // Llama ese método desde el main.
    
    public void crearPersona(Persona persona) {
    
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
    }
}
