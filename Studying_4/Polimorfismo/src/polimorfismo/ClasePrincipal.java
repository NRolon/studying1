
package polimorfismo;

/**
 *
 * @author NRolon
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        
        //Al utilizar Polimorfismo creamos el objeto con relacion a la clase principal
        //en este caso ClasePadre , pero luego especificamos de que clase vamos
        // a tomar el comportamiento, en este caso claseHija Suma
            
        Operaciones_ClasePadre mensajero_Suma = new Suma_ClaseHija();
        
        mensajero_Suma.pedirDatos();
        mensajero_Suma.Operaciones(); // comportamiento de Suma
        mensajero_Suma.mostrarResultado();
        
        Operaciones_ClasePadre mensajero_Resta = new Resta_ClaseHija();
        
        mensajero_Resta.pedirDatos();
        mensajero_Resta.Operaciones(); //comportamiento de Resta    
        mensajero_Resta.mostrarResultado();
        
    }
    
}
