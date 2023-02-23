
package clases;
import java.util.Random;
/**
 *
 * @author NRolon
 */
public class ClaseDos {
    
    public static void main(String[] args) {
        
        // el jdk viene incluido con la libreria RANDOM, para eso debe ser importado
        
        int Aleatorio = 0;
        
        // se crea un objeto de la clase Random
        Random r = new Random();
        
        Aleatorio = (int)(r.nextDouble() * 100); //la clase trabaja con valores double,por eso se hace un casting, el num multiplicado
                                                 // determina el rango de valores, en este caso hasta 100
        System.out.println("El numero aleatorio es: " + Aleatorio);
        
    }
}
