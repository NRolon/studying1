
package clases;

/**
 *
 * @author NRolon
 */
public class ClaseUno {
    
    public static void main(String[] args) {
        
        int Aleatorio = 0;
        
        Aleatorio = (int)(Math.random() * 100); // se realiza un casting, osea convertimos el valor radian que devuelve siempre math. a otro-
        // el numero por el que se multiplica determina el max valor que se puede obtener del num aleatorio que se genera
        
        System.out.println("El numero aleatorio es: " + Aleatorio);
    }
    
}
