package Operaciones;

import java.util.Random;
import java.util.Scanner;

public class AleatorioNum {

	Scanner entrada = new Scanner(System.in);
	int aleatorio = 0;
	
	Random r = new Random();
	
	public void NumAleato() {
		
		aleatorio = (int) (r.nextDouble()*100);
		System.out.println("Usted ha generado el siguiente numero aleatorio: \n"+aleatorio);
		
	}
}
