package Temperaturas;

import java.util.Scanner;

public class KelvinaFarenheit {

	Scanner lector = new Scanner(System.in);
	
	double F, K;
	
	public void KelvinFa() {
		System.out.println("Ingrese la cantidad de grados Kelvin a convertir: ");
		K = lector.nextInt();
		
		F = 9 / 5 * (K - 273) + 32;
		
		System.out.println(K+" grados Kelvin equivalen a "+F+
				" grados Farenheit");
	}
}
