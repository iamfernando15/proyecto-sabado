package Temperaturas;

import java.util.Scanner;

public class DeCelsiusaKelvin {

	Scanner lector = new Scanner(System.in);
	
	double K, C;
	
	public void CelsiusKelvin() {
		
		System.out.println("Ingrese la cantidad de grados Celsius a convertir: ");
		C = lector.nextDouble();
		
		K = C + 273;
		
		System.out.println(C+" Grados Celsius equivale a "+K+
				" grados Kelvin");
	}
}
