package clases;

/**
 *
 * @author NRolon
 */
public class ClasePrincipal {

    public static void main(String[] args) {

        Proceso1 hilo1 = new Proceso1(); // Se utiliza esta instancia porque estamos heredando (extends)
        Proceso1 hilo3 = new Proceso1();        
        Thread hilo2 = new Thread(new Proceso2()); // se utiliza esta instancia porque estamos implementando un objeto Runnable
        
        hilo1.start(); // Se ordena de esta forma para que se ejecuten de manera simultanea, de lo contrario es innecesario utilizar Hilos
        hilo2.start();
        hilo3.start();

    }

}
