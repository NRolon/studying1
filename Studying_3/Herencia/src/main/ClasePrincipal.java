
package main;

// Se importan paquetes
import operaciones.ClaseHija_Resta;
import operaciones.ClaseHija_Suma;


/**
 *
 * @author NRolon
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        
        // Creacion de objeto mensajeroSuma que se toma de ClaseHija_Suma
        ClaseHija_Suma mensajeroSuma = new ClaseHija_Suma();
        
        // Se puede utilizar el metodo pedirDatos porque ClaseHija_Suma lo hereda de ClasePadre
        mensajeroSuma.pedirDatos();
        
        // Metodo para realizar suma de ClaseHija_Suma
        mensajeroSuma.Sumar();
        
        System.out.print("El resultado de la suma es: ");
        mensajeroSuma.mostrarDatos();
        
        ClaseHija_Resta mensajeroResta = new ClaseHija_Resta();
        
        mensajeroResta.pedirDatos();
        
        mensajeroResta.Resta();
        
        System.out.print("El resultado de la resta es: ");
        
        mensajeroResta.mostrarDatos();  
        
    }
    
        
}
