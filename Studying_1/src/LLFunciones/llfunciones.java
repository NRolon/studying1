
package LLFunciones;

/**
 *
 * @author NRolon
 */

public class llfunciones {
    
    private int kilos = 0, llenadoCompleto = 0, tipoDeRopa = 0, lavadoCompleto = 0, secadoCompleto = 0;
    
    public llfunciones (int kilos, int tipoDeRopa){
        
        this.kilos = kilos;
        this.tipoDeRopa = tipoDeRopa;
    }
    
    private void llenado (){
        
        if( kilos<= 12){
            
            llenadoCompleto=1;
            System.out.println("Llenando..");
            System.out.println("Llenado Completo");
        }
        else{
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        }
        
    }
    
    private void lavado() {
        
        llenado();
        
        if( llenadoCompleto == 1){
            
            if( tipoDeRopa == 1){
                
                System.out.println("Ropa blanca / Lavado suave");
                System.out.println("Lavando..");
                lavadoCompleto = 1;
                
            } else if( tipoDeRopa == 2){
                
                System.out.println("Ropa de color / Lavado intenso");
                System.out.println("Lavando..");
                llenadoCompleto = 1;
                
            }
            else{
                
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("Se lavara como ropa de color / Lavado intenso");
                lavadoCompleto = 1;
                
            }
                    
        }
        
    }
    
    private void secado(){
        
        lavado();
        
        if(lavadoCompleto == 1 ){
            
            System.out.println("Secando..");
            secadoCompleto = 1;
            
        }
    }
    
    public void CicloFinalizado(){
        
        secado();
        if ( secadoCompleto == 1){
            System.out.println("Tu ropa está lista");
        }
        
    }
    
    
    
    
}
