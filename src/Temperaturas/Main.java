package Temperaturas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		
		int respuesta;
		
		ConverCF c = new ConverCF();
		ConverFC f = new ConverFC();
		DeCelsiusaKelvin k = new DeCelsiusaKelvin();
		KelvinaCelsius p = new KelvinaCelsius();
		FarenheitaKelvin fp = new FarenheitaKelvin();
		KelvinaFarenheit tk = new KelvinaFarenheit();
		
		do {
		System.out.println("Seleccione una opcion: ");
		System.out.println("1. Convertir Celsius a Farenheit");		
		System.out.println("2. Convertir Farenheit a Celsius");
		System.out.println("3. Convertir Celsius a Kelvin");
		System.out.println("4. Convertir Kelvin a Celsius");
		System.out.println("5. Convertir Farenheit a Kelvin");
		System.out.println("6. Convertir Kelvin a Farenheit");
		System.out.println("7. Salir\n");
		
		respuesta = (int) lector.nextInt();
		
		switch(respuesta) {
		case 1:
			c.CelsiusFaren();
			break;
		case 2:
			f.FarenCels();
			break;
		case 3:
			k.CelsiusKelvin();
			break;
		case 4:
			p.KelvinCelsius();
			break;
		case 5:
			fp.FarenKelvin();
			break;
		case 6:
			tk.KelvinFa();
			break;
		case 7:
			System.exit(0);
		default:
			System.out.println("Opcion incorrecta\n");
		}
	} while(respuesta!=7);
		
	}

}
