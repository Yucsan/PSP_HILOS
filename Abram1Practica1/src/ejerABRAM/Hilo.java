package ejerABRAM;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hilo extends Thread {

	public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    
    
    private List<Integer> numeros= new ArrayList<>();
    private int num;
    private Date fecha=new Date();
    
	public void run() {
		for (int i = 1; i <= 20; i++) {
			if (getName().equals("HILO0")) {
				if (!numeros.isEmpty()) {//si tiene algo
					num = i+numeros.get(numeros.size()-1);
				} else {
					num=i;
				}
				numeros.add(num);
				System.out.println("Ejecución "+this.getName()+i+": "+numeros);
			}else {
				System.out.println(ANSI_RED+"Ejecución "+this.getName()+": "+"La fecha actual es: "+fecha.toString());
			}
		}
	}
}
