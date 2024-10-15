package ejercicio6_hilos_sin_sincronizar;

import java.time.LocalDate;

public class HiloB extends Thread {
	public static final String RED = "\u001B[31m";
		public void run() {
			for (int i = 1; i <= 20; i++) {
				System.out.println(RED+this.getName()+" fecha "+i+" - "+LocalDate.now());
			}
		}
	
}
