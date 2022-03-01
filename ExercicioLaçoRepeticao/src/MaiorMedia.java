import java.util.Scanner;
//faça um programa que leia 5 numeros 
//informe o maior numero
//e a media desses numeros
public class MaiorMedia {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		
		int count= 0;
		do {
			System.out.println("numero:");
			numero = scan.nextInt();
			
			soma = soma + numero;
			
			
			if(numero > maior) maior = numero;
			
			count = count +1;
			
		}while(count < 5);
		
		System.out.println("soma " + soma);
		System.out.println("media e : " + maior/5);
		
	}

}
