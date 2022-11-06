package Lista5;

import java.util.Scanner;

public class Exercicio2 {

	public class Lista05Ex1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um valor : ");

			int valor = sc.nextInt();

			if (valor > 0) {
				System.out.println("Número Positivo!");
			}

			if (valor < 0) {
				System.out.println("Número Negativo!");
			}

			sc.close();
		}

	}
}
