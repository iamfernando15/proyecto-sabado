package DecimalesyBinarios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un numero decimal: ");
		
		int input = scanner.nextInt();
		int digito;
		String binario = "";
		
		do {
			digito = input % 2;
			binario += digito;
			input = input / 2;
		}while(input!=0);
		binario = new StringBuilder(binario).reverse().toString();
		System.out.println("El numero en binario es: " + binario);
	}

}
