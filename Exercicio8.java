package Lista5;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Em que horas começou a partida ? : ");
		Double inicio=sc.nextDouble();
		
		
		System.out.println("Em que horas acabou a partida ? : ");
		Double fim=sc.nextDouble();
		
		
		
		if (inicio<fim) {
			Double duracao = (24 - inicio) + fim;
			System.out.println(duracao);
		}
		else { 
			Double duracao = fim - inicio;
			System.out.println(duracao);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
