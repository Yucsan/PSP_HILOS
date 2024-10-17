package prueba;

public class main {

	public static void main(String[] args) {
		int num1=5, num2=10;
		System.out.println(num2);
		
		if (num1 > num2) {
		    System.out.println("El numero mayor es: " + num1);
		} else {
			System.out.println("el numero2 es mayor");
		    while (num1 <= num2) {  // Cambié la condición
		        System.out.println(num1);
		        num1++;  // Primero se imprime, luego se incrementa
		    }
		}

	}

}
