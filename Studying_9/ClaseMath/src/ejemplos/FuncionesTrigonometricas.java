
package ejemplos;

/**
 *
 * @author NRolon
 * 
 *      TENER EN CUENTA QUE LAS FUNCIONES TRIGONOMETRICAS DEVUELVEN EL VALOR EN RADIANES
 */
public class FuncionesTrigonometricas {
    
    public static void main(String[] args) {
        
        double resultado = 0;
        double anguloGrados = 45;
        double anguloRadianes = Math.toRadians(anguloGrados);
        
        
        // Para obtener el seno
        resultado = Math.sin(anguloRadianes);
        System.out.println("Seno de: " + anguloGrados + "° = " + resultado);
        
        // Para obtener  coseno
        resultado = Math.cos(anguloRadianes);
        System.out.println("Coseno de: " + anguloGrados + "° = " + resultado);
        
        // Para obtener tangente 
        resultado = Math.tan(anguloRadianes);
        System.out.println("Tangente de: " + anguloGrados + "° = " + resultado);
        
        double valorIngresado = 0.707;
        
        
        // Arco Coseno
        anguloRadianes = Math.acos(valorIngresado);
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Arco coseno de: " + valorIngresado + " = " + anguloGrados + "°");
        
        
        //Arco seno
        anguloRadianes = Math.asin(valorIngresado);
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Arco seno de: " + valorIngresado + " = " + anguloGrados + "°");
        
        
        //Arco tangente
        anguloRadianes = Math.atan(valorIngresado);
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Arco tangente de: " + valorIngresado + " = " + anguloGrados + "°");
    }
    
}
