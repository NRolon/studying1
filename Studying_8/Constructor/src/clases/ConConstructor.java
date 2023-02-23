
package clases;
import java.util.Scanner;


/**
 *
 * @author NRolon
 */
public class ConConstructor {
    
    public ConConstructor() {
    
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        
        System.out.print("Cual es tu nombre?: ");
        nombre = entrada.nextLine();
        
        System.out.print("Tu nombre es: "+ nombre);
    }   
}
