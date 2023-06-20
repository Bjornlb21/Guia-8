package main;

import main.entidad.NIF;
import main.servicio.NIFServicio;

public class Main {

    public static void main(String[] args) {
        
        NIFServicio ns = new NIFServicio();
        
        NIF nif = ns.crearNIF();
        
        ns.calcularNIF(nif);

        ns.mostrarNIF(nif);
        
    }
}
