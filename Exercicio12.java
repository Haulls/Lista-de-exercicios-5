package Lista5;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		;
		System.out.println("Digite a quantidade atual em estoque : ");
		int quantidadeAtual = sc.nextInt();
		System.out.println("Digite a quantidade máxima em estoque: ");
		int quantidadeM = sc.nextInt();
		System.out.println("Digite a quantidade mínima em estoque : ");
		int quantidadeMínima = sc.nextInt();
		int QuantidadeMédia = quantidadeM + quantidadeMínima/2;
		
		
		
		if(QuantidadeMédia <= quantidadeAtual) { 

		  System.out.println("Não efetuar compra!");

		} else {
			
			System.out.println("Quantidade média = " +QuantidadeMédia+ " Efetuar compra!");
	}

		sc.close();
		
}
}