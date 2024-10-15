package fecha_Sincronizado;

import java.time.LocalDateTime;
import java.util.Date;

//en esta opcion se usan una fecha futura
public class HiloB extends Thread  {
	public static final String RED = "\u001B[31m";
	
	public void run() {
		
		Date hoy=new Date();
		Date fechaAhora=new Date();
		long fechaFutura= (long)(hoy.getTime()/1000+10);
		//divides 1000 convertir milisegundos en segundos 
		//y le sumas 10. Esto establece un tiempo futuro
		while(fechaAhora.getTime()/1000!=fechaFutura) {
			fechaAhora=new Date();
			System.out.println(RED+"Ejecuta+ " +this.getName() +"fecha: "+LocalDateTime.now());
		}
		//mientras que el tiempo no sea el del futuro no se detiene
	}
}
