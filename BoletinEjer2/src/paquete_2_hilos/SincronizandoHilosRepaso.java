package paquete_2_hilos;

import java.util.Scanner;

/*
2.- Diseñar un programa en modo consola que pida dos números naturales por
teclado. Debe crear una tarea que muestre en pantalla el valor del primer
número siempre y cuando sea menor que el del segundo. A posteriori
incrementa ese primer número. Finaliza cuando el valor incrementado es igual al
segundo número. Crea otra tarea que realice lo mismo pero que sea un Daemon
de tal forma que no termine nunca de ejecutarse. (el primer número será mayor
que el segundo). Mostrar en pantalla si la tarea es una aplicación o un Daemon.
Y cuando finalice la tarea debe aparecer también un mensaje indicando que
tarea ha terminad
 * */

public class SincronizandoHilosRepaso {

	public static void main(String[] args) {
		
		Hilo hilo0=new Hilo();
		hilo0.setName("HILO0");
		hilo0.start();
		/*
		Hilo hilo1=new Hilo();
		hilo1.setName("HILO1");
		hilo1.start();*/
		

	}

}
