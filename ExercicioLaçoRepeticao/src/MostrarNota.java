import java.util.Scanner;
//faça um programa que peça uma nota entre 0 e 10 e mostre uma mensagem caso a nota for invalida

public class MostrarNota {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Digite uma nota : ");
		nota = scan.nextInt();
		
		while(nota < 0 | nota > 10) {
			System.out.println("nota invalida, Digite novamente : ");
			scan.nextInt();
			
		}
		
		
		
		
	}

}
