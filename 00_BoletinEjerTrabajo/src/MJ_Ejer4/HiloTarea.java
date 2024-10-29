package MJ_Ejer4;

public class HiloTarea extends Thread{
	
	private Mensaje mensaje;
	
	public HiloTarea(Mensaje msn) {
		this.mensaje=msn;
	}
	
	
	
	public void run() {
		for(int i=0; i<10; i++) {
			synchronized (this.mensaje) {
				System.out.println(this.getName()+" enterado del mensaje: + this.mensaje "+this.mensaje.getMensaje());
				this.mensaje.setMensaje(this.getName()+ ": MSG"+i);
			}
			try {
				sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


	
	
	
	
}
