
package ejemplos;

/**
 *
 * @author NRolon
 * 
 *  SIEMPRE QUE SE TRABAJE CON LA CLASE MATH, Se trabaja en atributos DOUBLE
 */
public class Conversiones {
    
    public static void main(String[] args) {
        
        double anguloGrados = 45;
        
        // Con el metodo toRadians, pasamos el parametro a valor en radianes
        double anguloRadianes = Math.toRadians(anguloGrados);
        
        System.out.println("Deg a Rad " + anguloGrados + "° = " + anguloRadianes + " rad");
        
        
        // Con ésto realizamos la inversa, convertimos radianes a grados con el metodo toDegrees
        anguloGrados  = Math.toDegrees(anguloRadianes);
        
        System.out.println("Rad a Deg " + anguloRadianes + " rad = " + anguloGrados + "°");
        
    }
    
}
