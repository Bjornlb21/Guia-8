
package main;

import main.entidad.Raices;
import main.servicio.RaicesServicio;

public class Main {

    public static void main(String[] args) {
        
        RaicesServicio rs = new RaicesServicio();
        
        Raices r = new Raices(5, 8, 3);

        rs.calcular(r);
    }
}
