
package palabra_super;

/**
 *
 * @author NRolon
 */
public class Hija extends Padre{
    
    public void Saludar(){
        
        
        // con la palabra reservada SUPER hacemos que tome referencia al 
        // metodo de la clase padre en donde estemos, en este caso PADRE
       
        super.Saludar();
        
    }
    
}
