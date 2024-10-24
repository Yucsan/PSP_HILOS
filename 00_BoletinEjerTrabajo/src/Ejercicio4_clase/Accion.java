package Ejercicio4_clase;

public class Accion extends Thread {

	private String mensaje;
	private static boolean turnoHola = true;

	public Accion(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public void run() {
		for(int i =0; i<10; i++)
			System.out.println(mensaje);
	}
	
	public synchronized void mensaje() {
		
		try {
			while(turnoHola) {				
				wait();
			}
			
			System.out.println(mensaje);
			turnoHola = false;
			
			notifyAll();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	

}
