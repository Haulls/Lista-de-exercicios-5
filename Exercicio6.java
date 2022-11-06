package Lista5;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
			
	System.out.println("Digite o primeiro valor :");	
	int valor1=sc.nextInt();
	
	System.out.println("Digite o segundo valor : ");
	int valor2=sc.nextInt();
		
		
	if (valor1>valor2) {
		System.out.println("O maior valor é : "+valor1);
	} if (valor1<valor2) {
		
		System.out.println("O maior valor é : "+valor2);
	}
		
	if (valor1==valor2) {
		System.out.println("Valores iguais não são permitidos!");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
