package division;

import java.util.Scanner;

/**
 *
 * @author NRolon
 */
public class ClaseDivision {

    public static void main(String[] args) {

        try { //código que queremos que compile
            int valor1, valor2, resultado;
            Scanner entrada = new Scanner(System.in);

            System.out.print("Ingrese el primer valor: ");
            valor1 = entrada.nextInt();

            System.out.print("Ingrese el segundo valor: ");
            valor2 = entrada.nextInt();

            resultado = valor1 / valor2;

            System.out.println("El resultado es: " + resultado);
        } catch ( Exception e) { // Comportamiento tras el error
            System.out.println("Error!!! " + e); // va la letra "e" o como se haya declarado el objeto Excepcion
        } finally {
            System.out.println("Operacion concluida!!");
        }

    }

}
