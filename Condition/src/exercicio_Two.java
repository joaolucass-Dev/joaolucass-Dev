import java.util.Scanner;

public class exercicio_Two {
	void main(String[] args) {
		System.out.println("========Verify Number Par or Impa========");
		try(Scanner sc = new Scanner(System.in)) {
			int numero;
			System.out.println("Escreva um numero: ");
			numero = sc.nextInt();
			
			if(numero % 2 == 0) {
				System.out.println(numero + " é par");
			}
			else {
				System.out.println(numero + " é ímpar");
			}
		}
	}
}
