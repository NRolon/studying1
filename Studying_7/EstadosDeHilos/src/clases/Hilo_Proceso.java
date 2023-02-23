
package clases;

/**
 *
 * @author NRolon
 */
public class Hilo_Proceso extends Thread{
    
    @Override
    public void run(){
        
        for(int i = 0;i <= 5; i++){
        
        System.out.println(i + " " + getName());
        
        try{ // al utilizar el metodo Sleep, se necesita forzozamente utilizar try-catch
            
            Hilo_Proceso.sleep(1000); // Por consecuencia de la herencia, se heredan metodos y atributos, en este caso el metodo Sleep de la clase Thread
        }catch( InterruptedException e){
            
            System.out.println("Error dentro de la clase" + e );
        }
        
        
    }
    }
    
    
}
