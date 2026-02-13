import java.util.Scanner;

public class exercicio_three {
	void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int A, B, K;
			System.out.println("------------Verify number int---------");
			
			System.out.println("Escoha o primeiro numero: ");
			A = sc.nextInt();
			
			System.out.println("Escoha o segundo numero: ");
			B = sc.nextInt();
			
			System.out.println(A % B);
			
			if(A % B == 0 || B % A == 0) {
				System.out.println("São Multiplos");
			}
			else{
				System.out.println("Não são Multiplos");
			}
		}
	}
}
