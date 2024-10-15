package ejerABRAM;

public class SincronizandoHilos {

	public static void main(String[] arg) {
		
		Hilo hilo0=new Hilo();
		hilo0.setName("HILO0");
		hilo0.start();
		
		Hilo hilo1=new Hilo();
		hilo1.setName("HILO1");
		hilo1.start();

	}
}
