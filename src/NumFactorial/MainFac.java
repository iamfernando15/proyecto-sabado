package NumFactorial;

import java.util.Scanner;

public class MainFac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		int numero = 0;
		int factorial = 1;
		
		System.out.println("Ingrese el numero a calcular su factorial: ");
		numero = leer.nextInt();
		int numero1 = numero;
		while( numero !=0) {
			
			factorial *= numero;
			
			numero --;
		}
		
		System.out.println("El factorial del numero "+numero1+ " es " +factorial );
	}
}
