package Ejercicio4_clase;

public class Mensaje implements Runnable {
    private String mensaje;
    private boolean readyToPrint = false;

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public synchronized void msn() throws InterruptedException {
        // Wait until the message is ready to print
        while (!readyToPrint) {
            wait();
        }

        System.out.println(mensaje);

        // After printing, reset the state and notify all waiting threads
        readyToPrint = false;
        notifyAll();
    }

    // This method will signal the message is ready to print
    public synchronized void prepareMessage() {
        readyToPrint = true;
        notifyAll();
    }

    @Override
    public void run() {
        try {
            msn();  // Run the msn method
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
