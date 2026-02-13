import java.util.Locale;
import java.util.Scanner;

public class five {
	void main (String [] args) {
		Locale.setDefault(Locale.US);
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("=====Calculo de diferença=======");
			int a,b,c,d;
			
			System.out.println("Insira o valor do A");
			a = sc.nextInt();
			
			System.out.println("Insira o valor do A");
			b = sc.nextInt();

			System.out.println("Insira o valor do A");
			c = sc.nextInt();
			
			System.out.println("Insira o valor do A");
			d = sc.nextInt();
			
			int resultado = a * b - c * d;
			
			System.out.println("A diferença do AB e CD é: " + resultado);
		}
	}
}
