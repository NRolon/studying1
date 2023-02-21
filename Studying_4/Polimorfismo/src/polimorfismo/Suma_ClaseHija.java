
package polimorfismo;

/**
 *
 * @author NRolon
 */
public class Suma_ClaseHija extends Operaciones_ClasePadre{
    
    @Override //palabra reservada para sobreescribir metodos heredados
    
    public void Operaciones(){
        
        resultado = valor1+valor2;
        
    }
    
}
