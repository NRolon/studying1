
package clases;

/**
 *
 * @author NRolon
 * 
 *      Tener en cuenta que para la suma/resta de matrices
 *      las matrices deben ser de la misma dimension, ej 3x3 + 3x3 = matriz resultante  3x3
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        int matriz_uno[][] = new int[3][3]; // Declaracion de matriz 3x3
        int matriz_dos[][] = new int[3][3];
        int matriz_resultante[][] = new int[3][3];
        
        //  Llenado de la primer matriz
        
        for(int i=0; i < matriz_uno.length; i++){
            for(int j=0; j < matriz_uno.length; j++){
                matriz_uno[i][j] = (int)(Math.random() * 5); // se genera num aleatorio en la matriz_uno, recordar que se realiza un casting
            }
        }
        
        //  Llenado de la segunda matriz
        
        for(int i=0; i < matriz_dos.length; i++){
            for(int j=0; j < matriz_dos.length; j++){
                matriz_dos[i][j] = (int)(Math.random() * 5); // se genera num aleatorio en la matriz_dos
            }
        }
        
        // Suma o Resta de matrices
        
        for(int i=0; i < matriz_uno.length; i++){
            for(int j=0; j < matriz_dos.length; j++){
                matriz_resultante[i][j] = matriz_uno[i][j] + matriz_dos[i][j]; // para suma, de lo contrario poner "-" para resta
            }   
        }
        
        // Mostrar en pantalla las matrices
        
        for(int i=0; i < matriz_uno.length; i++){ // for para poder recorrer filas
            
            for(int j=0; j < matriz_uno.length; j++){ //for para recorrer columnas
                
                System.out.print("[ " + matriz_uno[i][j] + " ]");
            }   
            if(i == 1){ // Para poder ingresar el + entre las matrices
                System.out.print("   +   ");
            } else{
                System.out.print("       ");
            }
            
            
            for(int j=0; j < matriz_dos.length; j++){ 
                
                System.out.print("[ " + matriz_dos[i][j] + " ]");
            }   
            
            if(i == 1){ // Para poder ingresar el = entre las matrices
                System.out.print("   =   ");
            } else{
                System.out.print("       ");
            }
            
            for(int j=0; j < matriz_resultante.length; j++){ 
                
                System.out.print("[ " + matriz_resultante[i][j] + " ]");
            }  
            
            System.out.println(""); 
        }
        
    }
    
}
