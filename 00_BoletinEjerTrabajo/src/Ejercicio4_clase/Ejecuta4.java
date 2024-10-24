package Ejercicio4_clase;

public class Ejecuta4 {

    public static void main(String[] args) {
        
        Accion ac1 = new Accion("Hola");
        Accion ac2 = new Accion("Adios");
        
        Thread t1 = new Thread(ac1);
        Thread t2 = new Thread(ac2);
        
        t1.start();
        t2.start();
    }
}