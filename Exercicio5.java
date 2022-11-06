package Lista5;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Olá, você esta no Sistema Eleitoral ! ");
			System.out.println("Digite o ano em que você nasceu : ");
			int ano=sc.nextInt();
			
			System.out.println("Digite o ano Atual : ");
			int atual=sc.nextInt();
		
		if (ano-atual>=18) {
			
			System.out.println("Você Pode votar!");
		} else {
			System.out.println("Você não pode votar!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
