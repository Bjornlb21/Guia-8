package main;

import main.entidad.Persona;
import main.servicio.PersonaServicio;

public class Main {

    public static void main(String[] args) {
        
        PersonaServicio ps = new PersonaServicio();
        
        Persona[] personas = new Persona[4];
        
        int pesoIdeal = 0;
        int pesoPorDebajo = 0;
        int sobrePeso = 0;
        int esMayor = 0;
        int esMenor = 0;
        
        int[] IMC = new int[2];
        boolean[] mayorOmenor = new boolean[personas.length];

        
        for (int i = 0; i < personas.length; i++) {
            
            System.out.println("========== Persona [" + (i + 1) + "] ==========");
            System.out.println("");
            
            personas[i] = ps.crearPersona();
            
            IMC[i] = ps.calcularIMC(personas[i]);
            
            switch (IMC[i]) {
                case -1:
                    
                    pesoPorDebajo++;
                    
                    break;
                case 0:
                    
                    pesoIdeal++;
                    
                    break;
                default:
                    
                    sobrePeso++;
                    
                    break;
            }
            
            mayorOmenor[i] = ps.esMayorDeEdad(personas[i]);
            
            if (mayorOmenor[i]) {
                
                esMayor++;
                
            } else {
            
                esMenor++;
            }
        }
        
        System.out.println("Porcentaje de Personas Mayores de edad: [" + ((esMayor / (double) 4) * 100) + "%].");
        System.out.println("Porcentaje de Personas Menores de edad: [" + ((esMenor / (double) 4) * 100) + "%].");
        System.out.println("Porcentaje de Personas con Peso Ideal: [" + ((pesoIdeal / (double) 4) * 100) + "%].");
        System.out.println("Porcentaje de Personas por debajo de su Peso Ideal: [" + ((pesoPorDebajo / (double) 4) * 100) + "%].");
        System.out.println("Porcentaje de Personas con Sobrepeso: [" + ((sobrePeso / (double) 4) * 100) + "%].");
    }
}

/**
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, 
 *    deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal 
 *    e indicar para cada objeto si la persona es mayor de edad.
 * Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays),
 *    para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal
 *    y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. 
 * Para esto, podemos crear unos métodos adicionales.
 */