package Temperaturas;

import java.util.Scanner;

public class ConverCF {

	Scanner lector = new Scanner(System.in);
	
	double F, C;
	
	public void CelsiusFaren() {
		
		System.out.println("Ingrese la cantidad de grados Celsius a convertir: ");
		C = lector.nextInt();
		
		F = 9 / 5.0 * C + 32;
		
		System.out.println(C+" Grados Celsius equivale a "+F+
				" grados Farenheit");
		
	}
}
