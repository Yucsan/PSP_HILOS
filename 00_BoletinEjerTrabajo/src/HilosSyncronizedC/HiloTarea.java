
package HilosSyncronizedC;

public class HiloTarea extends Thread {

	private String nombre;
	private Mensaje mensaje;
	private boolean esHola;

	public HiloTarea(String nombre, Mensaje mensaje, boolean esHola) {
		this.nombre = nombre;
		this.mensaje = mensaje;
		this.esHola = esHola;
	}

	@Override
	public void run() {
		//System.out.println(nombre + " llego."); con esto veo cual llega primero
		// verifico si es jefe
		for(int i=0; i<10; i++) {			
			if (esHola) 
				mensaje.saludoHola(nombre);
			else 
				mensaje.saludoAdios(nombre);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//los hilos se ejecutan en desorden, tons si es uno u otro llamas a un metodo 
	

}
