package main.servicio;

import java.util.Scanner;
import main.entidad.NIF;

public class NIFServicio {

    // Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá.
    // Una vez calculado, le asigna la letra que le corresponde según

    public NIF crearNIF(){
    
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        NIF nif = new NIF();
        
        System.out.print("Ingrese su Número de DNI: ");
        nif.setNumeroDNI(leer.nextLong());
        
        System.out.println("");
        
        return nif;
    }
    
    // La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente manera: 
    // Para calcular la letra se toma el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22).     // El método debe buscar en un array (vector) de caracteres la posición que corresponda 
    //    al resto de la división para obtener la letra correspondiente.
    
    public void calcularNIF(NIF nif) {
        
        char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        nif.setLetra(letra[(int) nif.getNumeroDNI() % 23]);
        
    }
    
    // Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
    
    public void mostrarNIF(NIF nif) {

        System.out.println("DNI    | Letra");
        System.out.printf("%08d-%c", nif.getNumeroDNI(), nif.getLetra());
        System.out.println("");
    }
}
