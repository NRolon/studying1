
package clases;
import java.util.Scanner;


/**
 *
 * @author NRolon
 */
public class SinConstructor {
    
    private Scanner entrada = new Scanner(System.in);
    String nombre="";
    
    public void pedirNombre(){
        
        System.out.print("¿Cual es tu nombre: ");
        nombre = entrada.nextLine();
    }
    
    public void Imprimir(){
        
        System.out.println("Tu nombre es: "+ nombre);
    }
}
