package Temperaturas;

import java.util.Scanner;

public class ConverFC {

	Scanner lector = new Scanner(System.in);
	
	double C, F;
	
	public void FarenCels() {
		
		System.out.println("Ingrese la cantidad de grados Farenheit a convertir: ");
		F = lector.nextDouble();
		
		C = 5 / 9.0 * F - 32;
		
		System.out.println(F+" Grados Farenheit equivale a "+C+
				" grados Celsius");
	}
}
