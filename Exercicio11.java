package Lista5;

import java.util.Scanner;

public class Exercicio11 {
public static void main(String [] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu saldo : ");
		float Saldo=sc.nextFloat();
		
		
		System.out.println("Digite seu débito : ");
		float débito=sc.nextFloat();
		
		System.out.println("Digite seu crédito : ");
		float crédito=sc.nextFloat();
		
		
		float saldoA=Saldo-débito+crédito;
		System.out.println("O seu saldo atual é de : "+saldoA);
		
	if (saldoA > 0 ) {
			System.out.println("Saldo Positivo");
		} if (saldoA < 0) {
			System.out.println("Saldo Negativo");
		}
		sc.close();
	}

}


