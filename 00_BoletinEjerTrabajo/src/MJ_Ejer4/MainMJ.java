package MJ_Ejer4;

public class MainMJ {

	public static void main(String[] args) {
		
		Mensaje  m1=new Mensaje();
		HiloTarea h1=new HiloTarea(m1);
		HiloTarea h2=new HiloTarea(m1);
		
		h1.start();
		h2.start();
		

	}

}
