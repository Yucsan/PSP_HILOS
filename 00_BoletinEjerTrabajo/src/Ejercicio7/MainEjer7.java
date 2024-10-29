package Ejercicio7;

public class MainEjer7 {
    private static int cont = 0;

    public void ejecuta(String [] archivos, String palabra) {
    	 String[] archivitos = archivos;
         String palabrita="";
         String nombreHilo="";
         // Start a new thread for each file
         for (String archivo : archivitos) {
             Lectura t1 = new Lectura(palabrita, archivo);
             t1.start();

             // Wait for thread to finish to ensure count is updated
             try {
                 t1.join();
             } catch (InterruptedException e) {
                 System.out.println("Thread interrupted: " + e.getMessage());
             }

             // Show the count and add it to the total
             //t2.muestraCuenta();
             cont += t1.getCuenta();
             palabrita = t1.getPalabra();
             nombreHilo = t1.getName();
         }
         System.out.println(nombreHilo +"Palabra: " + palabra + " número total: " + cont);
    }
    
    
    public static void main(String[] args) {
        String[] archivitos = new String[] { "archivo1", "archivo2", "archivo3", "archivo4" };
        String palabra="";
        String nombreHilo="";
        // Start a new thread for each file
        for (String archivo : archivitos) {
            Lectura t2 = new Lectura("Fernando", archivo);
            t2.start();

            // Wait for thread to finish to ensure count is updated
            try {
                t2.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }

            // Show the count and add it to the total
            //t2.muestraCuenta();
            cont += t2.getCuenta();
            palabra= t2.getPalabra();
            nombreHilo = t2.getName();
        }
        System.out.println(nombreHilo +"Palabra: " + palabra + " número total: " + cont);
        
        
        MainEjer7 m7=new MainEjer7();
        m7.ejecuta(archivitos, "web");
    }
}
