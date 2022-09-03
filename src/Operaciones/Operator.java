package Operaciones;

import java.util.Scanner;

public class Operator {
	Scanner entrada = new Scanner(System.in);
	int num1, num2, resultado;
	

	public void suma() {
		
		resultado = num1 + num2;
		System.out.println("El resultado de la suma es: "+resultado);
	}
	
	public void datos() {
		
		System.out.println("Ingresa el primer valor ");
		num1 = entrada.nextInt();
		
		System.out.println("Ingresa el segundo valor ");
		num2 = entrada.nextInt();
	}
}
