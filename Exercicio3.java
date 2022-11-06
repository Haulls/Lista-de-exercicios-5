package Lista5;

import java.util.Scanner;

public class Exercicio3 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	

		System.out.println("Digite o número de maçãs compradas : ");
		int maçãscompradas=sc.nextInt();
		
		double totalcompra = 0;
		double valormaças = 0;
		if (maçãscompradas < 12) {
			
			valormaças = 1.30;
			
		} else {

			valormaças = 1;
			
		}
		totalcompra = maçãscompradas * valormaças;
System.out.println("Valor total : " +totalcompra);













sc.close();
}
}
