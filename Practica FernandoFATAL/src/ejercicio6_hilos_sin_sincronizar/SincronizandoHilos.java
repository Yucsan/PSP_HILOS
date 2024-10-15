package ejercicio6_hilos_sin_sincronizar;



/*
 Crear un programa que jecute dos hilos uno a continuacion del otro
 Ambos hilos muestran un mensaje 25 veces en panatalla. "Ejecutando hilo nº"
 ¿que ocurre?
 Hay que comprobar que no estań sincronizados. (ejecuta los hilos como quiere. No llega a terminar
 la ejecución del hilo1 y viceversa).
 * */

public class SincronizandoHilos {

	public static void main(String[] args) {
		/*
		HiloA hiloA=new HiloA();
		hiloA.setName("HILOA");
		hiloA.start();
		
		HiloB hiloB=new HiloB();
		hiloB.setName("HILO1");
		hiloB.start();*/
		
		Runnable r1=new HiloA();
		Thread t1=new Thread(r1);
		t1.start();
		
		Runnable r2=new HiloB();
		Thread t2=new Thread(r2);
		t2.start();

	}

}
