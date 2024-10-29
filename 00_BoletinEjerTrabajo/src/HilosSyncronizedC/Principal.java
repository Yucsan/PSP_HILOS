package HilosSyncronizedC;


public class Principal {

    public static void main(String[] args) {
       
    	Mensaje s=new Mensaje();
    	
    	HiloTarea hola = new HiloTarea("persona 1", s, false);
    	HiloTarea adios = new HiloTarea("persona 2", s, true);
    	
    	hola.start();
    	adios.start();
    	

    }

}
