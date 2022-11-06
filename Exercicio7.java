package Lista5;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor A :");	
		int A=sc.nextInt();
		
		
	System.out.println("Digite o valor B :");
		int B=sc.nextInt();
		
		if (A>B) {
			System.out.println("A ordem dos números ficou : "+A+","+B);
		} else  {
			System.out.println("A ordem dos números ficou : "+B+","+A);
			
		}
		if (A==B) {
			System.out.println("Valores iguais não são permitidos!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	sc.close();	

	}

}
