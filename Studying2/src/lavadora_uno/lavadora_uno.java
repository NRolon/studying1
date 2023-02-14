
package lavadora_uno;
import java.util.Scanner;
import Libreria.llfunciones;

/**
 *
 * @author NRolon
 */
public class lavadora_uno {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿La ropa des blanca o de color?");
        System.out.println("Presiona 1 -Ropa Blanca / 2 -Ropa color");
        
        int tipoDeRopa = entrada.nextInt();
        
        System.out.println("¿Cuántos kilos de ropa?");
        
        int kilos = entrada.nextInt();
        
        llfunciones mensajero = new llfunciones (kilos,tipoDeRopa);
        mensajero.CicloFinalizado();
        
        //Seteando
        
        mensajero.setTipoDeRopa(5);
        
        
    }
    
}
