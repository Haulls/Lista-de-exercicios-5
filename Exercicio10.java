package Lista5;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Double comissao = 0.03;
		
		System.out.println("Digite seu salário fixo : ");
		Double salario=sc.nextDouble();
		
		System.out.println("Digite o numero de vendas : ");
		Double vendas=sc.nextDouble();
		
		if (vendas<=1500) {
			
			double totalcomissão = comissao * vendas;
			
			System.out.println("A comissão total foi de : "+totalcomissão);
			
		} else {

			Double totalcomissão = (comissao * 1500) + (vendas - 1500 ) * 0.05;
		
			Double totalsalario=salario + totalcomissão;
			
			System.out.println("Salário Total : "+totalsalario);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	sc.close();
	}

}
