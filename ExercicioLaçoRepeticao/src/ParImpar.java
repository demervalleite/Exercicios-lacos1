import java.util.Scanner;
//crie um programa que peça N numeros inteiros
//calcule e mostre a quantidade e numeros pares e impares


public class ParImpar {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int qtdNumeros = 0;
		int numero = 0;
		int pares = 0, impares = 0;
		
		
		System.out.println("quantidade de numeros : " );
		qtdNumeros = scan.nextInt();
		
		int count = 0;
		do {
			System.out.println("Numero : ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0)pares++;
			else impares++;	
			
			
		count++;	
		}while(count < qtdNumeros);
		
		System.out.println("quantidade de pares" + pares);
		System.out.println("quntidade de impares" +impares);
		
	}

}
