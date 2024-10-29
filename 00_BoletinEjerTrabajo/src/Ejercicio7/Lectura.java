package Ejercicio7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lectura extends Thread {
	private String nomFile;
	private String palabra;
	private int cuenta=0;
	
	public Lectura(String palabra, String nomFile) {
		this.palabra=palabra;
		this.nomFile=nomFile;
	}
	
	public void run() {
		String texto = "";
		try {
			// Apertura.
			FileReader fr = new FileReader("./archivos7/"+nomFile+".txt");
			BufferedReader br = new BufferedReader(fr);
			// Operaciones.
			while (br.ready()) {
				texto = br.readLine();
				if(texto.equals(palabra)) {
					cuenta++;
				}
				
			}
			// Clausura.
			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	

	
	public int getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public void muestraCuenta() {
		System.out.println("la palabra aparece : "+this.palabra +" "+ cuenta +" veces");
	}
	
	
	
	
	
}