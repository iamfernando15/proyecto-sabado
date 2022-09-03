package Operaciones;

import java.util.Scanner;

public class MainOp {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		int respuesta;
		
		Operator p = new Operator();
		AleatorioNum b = new AleatorioNum();
		
		do {
		
		System.out.println("\nSelecciona una opcion: ");
		System.out.println("1. Generar numero aleatorio");
		System.out.println("2. Suma");
		System.out.println("3. Salir\n");
		
		respuesta = entrada.nextInt();
		
		switch(respuesta) {
		case 1:
			b.NumAleato();
			break;
		case 2:
			p.datos();
			p.suma(); 
			break;
		case 3:
			System.exit(0);
		default: 
			System.out.println("Opcion Incorrecta");
		}
		
	} while(respuesta!=3);
		
	}
}
	
