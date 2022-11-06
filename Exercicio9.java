package Lista5;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int horasextra;
		
		System.out.println("Digite as horas trabalhadas nos mês : ");
		int trabalhadas=sc.nextInt();
		
		
		
		System.out.println("Valor da hora : ");
		Float horas=sc.nextFloat();
		
		if (horas <=40) {
			 horasextra= 0;

		} else {

		 horasextra = trabalhadas - 40;
			trabalhadas = 40;
		}
		
	 Float salario = horas * trabalhadas;
	 Float Extra = horas * horasextra;
		Extra = Extra * 1.5F; 
		
		System.out.println("Base : "+salario);
		System.out.println("Salário extra : "+Extra);
		System.out.println("Total :"+salario+Extra);
		
		sc.close();
	}
}
