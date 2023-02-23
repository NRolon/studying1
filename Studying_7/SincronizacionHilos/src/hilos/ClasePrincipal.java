
package hilos;

/**
 *
 * @author NRolon
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        
        Hilo1 Hilo1 = new Hilo1();
        Hilo2 Hilo2 = new Hilo2();
        Hilo3 Hilo3 = new Hilo3();
        Hilo4 Hilo4 = new Hilo4();
        
        
        //HILO1
        Hilo1.start();
        try{
            Hilo1.sleep(10);
        } catch ( InterruptedException e){
            System.out.println("Error en el hilo1" + e); 
        }
        
        
        //HILO2
        Hilo2.start();
        try{
            Hilo2.sleep(10);
        } catch ( InterruptedException e){
            System.out.println("Error en el hilo2" + e); 
        }
        
        
        //HILO3
        Hilo3.start();
        try{
            Hilo3.sleep(10);
        } catch ( InterruptedException e){
            System.out.println("Error en el hilo3" + e); 
        }
        
        
        //HILO4
        Hilo4.start();
        try{
            Hilo4.sleep(10);
        } catch ( InterruptedException e){
            System.out.println("Error en el hilo4" + e); 
        }
    }
    
}
