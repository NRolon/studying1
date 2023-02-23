
package clases;

/**
 *
 * @author NRolon
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        Hilo_Proceso hilo1 = new Hilo_Proceso(); //primer estado : NEW , todavia no fue inicializado, pero si creado
        Hilo_Proceso hilo2 = new Hilo_Proceso(); 
        
        hilo1.start(); // segundo estado: START, hilo ejecutandose
        
        try{                // tercer estado: SLEEP, frena el hilo por xx milisegundos, se utiliza TRY-CATCH forzosamente
            
            hilo1.sleep(1000); 
        } catch( InterruptedException e){ //para usar el catch en el tercer estado se utiliza InterruptedException
            
            System.out.println("Error en el hilo1" + e);
        }
        
        
        hilo2.start();  // cuarto estado, hilo muere normalmente finalizando la ejecucion.
        hilo2.stop(); // cuarto estado.2 , hilo muere por instruccion forzada
        
        try{
            
            hilo2.sleep(1000);
        } catch( InterruptedException e){
            
            System.out.println("Error en el hilo2" + e);
        }
        
    }
    
}
