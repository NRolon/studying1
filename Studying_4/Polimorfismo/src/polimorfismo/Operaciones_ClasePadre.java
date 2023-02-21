
package polimorfismo;
import java.util.Scanner;

/**
 *
 * @author NRolon
 */
public abstract class Operaciones_ClasePadre {
    
    protected int valor1,valor2,resultado;
    Scanner entrada = new Scanner(System.in);
    
    
    
    public void pedirDatos(){
    
        System.out.print("Dame el primer valor: ");
        valor1 = entrada.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        valor2 = entrada.nextInt();
}
        
    // para utilizar polimorfismo el metodo tanto la clase debe ser abstracta
    // no se puede utilizar logica dentro del metodo abstracto cuando se utiliza polimorfismo   
    // solo se puede llamar al metodo, la logica debe estar en herencia en otra clase   
    public abstract void Operaciones(); 
    
    
    public void mostrarResultado(){
        
        System.out.print("El resultado es: "+resultado);    
    }
    
    
    
}
