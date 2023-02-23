
package clases;

/**
 *
 * @author NRolon
 */
public class Proceso extends Thread{
    
    int num_int; // scope Global para poder recibir valor como parametro
    
    public Proceso(String nombreHilo){
        
        super(nombreHilo);
        
    }
    
    @Override
    public void run(){
        
        for (int i=0; i <= num_int ; i++){
            
            System.out.println(i + this.getName()); //getName captura el nombre del Thread de donde proviene
        }
        
        System.out.println("");
    }
    
    public void valorDeLaCondicion(int valor){
        
        this.num_int = valor;   
    }
}
