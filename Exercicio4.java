package Lista5;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		

		
		System.out.println("Digite a nota da primeira avaliação : ");
		Double nota1=sc.nextDouble();
		
		System.out.println("Digite a nota da Segunda avaliação : ");
		Double nota2=sc.nextDouble();
		
		
		Double media=nota1+nota2/2;
		
		System.out.println("");
		
		
		
		if (media>=6) {
			System.out.println("Aprovado! A média foi de : "+media);
		} else {
			System.out.println("Reprovado pois a média n atingiu a marca de 6 : "+media);
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
