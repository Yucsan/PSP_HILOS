package Ejercicio4_clase;

public class Ejecuta4 {

    public static void main(String[] args) throws InterruptedException {
        Mensaje mensajeRunnable = new Mensaje("Imprime");

        // Create a new thread for the Mensaje object
        Thread t = new Thread(mensajeRunnable);
        t.start();

        // Simulate some delay or other tasks before notifying the message
        Thread.sleep(1000); // Simulate work or delay

        // Now prepare the message and notify the waiting thread
        synchronized (mensajeRunnable) {
            mensajeRunnable.prepareMessage();
        }
    }
}
