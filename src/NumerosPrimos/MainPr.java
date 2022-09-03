package NumerosPrimos;

import java.util.Scanner;

public class MainPr {

	public static void main(String[] args) {
		
		int x, k = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite un valor: \n");
			
			x = sc.nextInt();
			
			for(int i = 1; i <= x; ++i) {
				
				if(x%i==0) {
					++k;
				}
			}
			
			if(k==2) {
				System.out.println("El numero es primo");
			}
			
			else {
				System.out.println("El numero no es primo");
			}
			k=0;
		}while(x!=0);
	}
}
