import java.util.Scanner;
//Leia dois dados, que ao ser inserido zero no nome ele pare 

public class NomeIdade {
	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Qual o seu nome?");
			nome = scan.next();
			if(nome.equals("0"))break;

			System.out.println("Qual a sua idade?");
			idade = scan.nextInt();
		}
		System.out.println("continua aqui");
		
		
		
	
	}

}
