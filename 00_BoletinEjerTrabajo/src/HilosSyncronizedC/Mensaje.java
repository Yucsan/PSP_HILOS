package HilosSyncronizedC;

public class Mensaje {
	private boolean llegado;

	public Mensaje() {
		this.llegado = false;
	}

	public synchronized void saludoAdios(String nombre) {

		try {
			while (!this.llegado) {
				wait();
			}
			System.out.println(" ADIOS ");
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	public synchronized void saludoHola(String nombre) {
		System.out.println(" HOLA ");
		this.llegado = true;
		// ya puede entrar el otro hilo
		notifyAll();
	}

}
