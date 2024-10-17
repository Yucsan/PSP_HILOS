package paquete_2_hilos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Hilo extends Thread  {
	public static final String BLUE = "\u001B[34m";
	public static final String RED = "\u001B[31m";
	private int numero1;
	private int numero2;
	
	public void tarea() {
		
		Scanner tecInt=new Scanner(System.in);
		System.out.println("Ingresa 1 número natural");
		this.numero1 = tecInt.nextInt();
		System.out.println("Ingresa 2 número natural");
		this.numero2 = tecInt.nextInt();		
	}
	
	
	public void run() {
		tarea();
		
		
		if (this.numero1 > this.numero2) {
		    System.out.println("El numero mayor es: " + numero1);
		} else {
			System.out.println("el numero2 es mayor");
		    while (numero1 <= numero2) {  // Cambié la condición
		    	
		    	if(getName().equals("HILO0"))
					System.out.println(BLUE+"Ejecuta+ " +this.getName() +"nº "+numero1);
		    	
		        numero1++;  // Primero se imprime, luego se incrementa
		        System.out.println("fin del :"+this.getName());
		    }
		}
	}
}
