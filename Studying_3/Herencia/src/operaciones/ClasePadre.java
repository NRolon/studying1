
package operaciones;
import java.util.Scanner;

/**
 *
 * @author NRolon
 */
public class ClasePadre {
    
    
    //Creacion de atributos y objeto tipo Scanner
    protected int valor1,valor2,resultado;
    Scanner entrada = new Scanner(System.in);
            
    
    // Metodo para solicitar datos al usuario
    public void pedirDatos(){
        
        System.out.print("Dame el primer valor: ");
        valor1 = entrada.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        valor2 = entrada.nextInt();
    }
    
    // Metodo para mostrar resultado
    public void mostrarDatos(){
        
        System.out.println("El resultado es: "+resultado);
        
    }
    
    
    
}
