package Temperaturas;

import java.util.Scanner;

public class KelvinaCelsius {

	Scanner lector = new Scanner(System.in);
	
	double C, K;
	
	public void KelvinCelsius() {
		
		System.out.println("Ingrese la cantidad de grados Kelvin a convertir: ");
		K = lector.nextDouble();
		
		C = K - 273.15;
		
		System.out.println(K+" Grados Kelvin equivale a "+C+
				" grados Celsius");
	}
}
