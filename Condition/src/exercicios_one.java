import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicios_one {
	void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("-------- Verify Number-------");
			int number;
			System.out.println("Digite um numero: ");
			number = sc.nextInt();
			
			if(number >= 0) {
				System.out.println("Maior Que Zero! Então é positivo");
			}
			else {
				System.out.println("OPA! Não é maior que Zero, então é negativo!!");
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Não pode letras");
		}
	}
}
