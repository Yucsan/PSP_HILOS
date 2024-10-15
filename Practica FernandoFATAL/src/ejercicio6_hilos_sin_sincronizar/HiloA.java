package ejercicio6_hilos_sin_sincronizar;

import java.util.ArrayList;

public class HiloA extends Thread {
	/*
	public void run() {
		String est="";
		for (int i = 1; i <= 20; i++) {
			int suma = i+i;
			int pas = suma;
			
			est += (i+suma)+" ";
			System.out.println(est+" "+i+"+"+pas+"="+(suma+i));
		}
	}*/
	public void run() {
	int suma=0;
    ArrayList<Integer> lista=new ArrayList<>();
    for(int i=1;i<=20;i++) {
        suma+=i;
        lista.add(suma);
        System.out.println(lista);
        
    }
	}
}
