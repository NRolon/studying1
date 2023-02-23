
package decimales;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author NRolon
 * 
 *  Recordar que la clase math devuelve como max hasta 15 decimales
 *  
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        double numero = 2; 
        double raiz = Math.sqrt(numero); //Con el metodo sqrt se obtiene la raiz cuadrada del parametro que le pasemos
        
        System.out.println("La raiz cuadrada de: " + numero + " es: " + raiz);
        
        
        // Se puede limitar decimales utilizando 4 posibles clases
        // Utilizando la clase DecimalFormat, es importante importar el paquete 
        // Crear un objeto de la clase DecimalFormat
        
        DecimalFormat df = new DecimalFormat ("#.00"); //como parametro pasar #, luego un "." y luego la cant de decimales que deseamos7
        System.out.println("La raiz cuadrada de: " + numero + " es: " + df.format(raiz)); // se concatena el objeto.format y como parametro 
                                                                                                // el valor que deseamos cambiar
        // 2da opcion. StringFormat
        System.out.println("La raiz cuadrada de: " + numero + " es: " + String.format("%.2f", raiz) ); //en el primer parametro va la cant
                                                                                                             //de decimales, por el otro lado la variable con el valor
    
        // 3ra opcion. Math.round
        System.out.println("La raiz cuadrada de: " + numero + " es: " + (double)Math.round(raiz * 100d) / 100 ); //agrega un punto en vez de comas
                                                                                                  // para incrementar decimales, se agregan "0" de mas
        System.out.println("La raiz cuadrada de: " + numero + " es: " + (double)Math.round(raiz * 10000d) / 10000 );
        
        // 4ta opcion. BigDecimal , para esto se debe importar 2 librerias, math.BigDecimal y math.RoundingMode
        // se crea un objeto de la clase BigDecimal
        
        BigDecimal bd = new BigDecimal (raiz); //dentro como parametro se coloca la variable que se desea limitar los decimales
        
        bd = bd.setScale(2, RoundingMode.HALF_UP); // con newScale pones la cant de decimales que quieras mostrar
        System.out.println("La raiz cuadrada de: " + numero + " es: " + bd.doubleValue());
        
               
    }   
    
}
