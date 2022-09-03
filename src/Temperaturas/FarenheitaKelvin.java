package Temperaturas;

import java.util.Scanner;

public class FarenheitaKelvin {

	Scanner lector = new Scanner(System.in);
	
	double K, F;
	
	public void FarenKelvin() {
		
		System.out.println("Ingrese la cantidad de grados Farenheit a convertir: ");
		F = lector.nextDouble();
		
		K = F - 32 / 1.8 + 273.15;
		
		System.out.println(F+" grados Farenheit equivale a "+K+
				" grado Kelvin");
	}
}
