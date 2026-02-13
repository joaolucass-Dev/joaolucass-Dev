import java.util.Locale;
import java.util.Scanner;

public class six {
	void main (String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			Locale.setDefault(Locale.US);
			float A, B, C;
			
			System.out.println("---------Calculos Float---------");
			System.out.println("A: ");
			A = sc.nextFloat();
			
			System.out.println("B: ");
			B = sc.nextFloat();
			
			System.out.println("C: ");
			C = sc.nextFloat();
			
			
			float triangulo = A*C/2f;
			System.out.printf("a área do triângulo retângulo que tem A por base e C por altura: %.3f%n ", triangulo);
			
			
			float raio = C*C*3.14159f;
			System.out.printf("a área do círculo de raio C. (pi = 3.14159): %.3f%n", raio);
			
			
			
			float trapezio = (A+B)*C/2f;
			System.out.printf("a área do trapézio que tem A e B por bases e C por altura: %.3f%n", trapezio);
			
			
			
			float quadrado = B * B;
			System.out.printf("a área do quadrado que tem lado B: %.3f%n", quadrado);
			
			
			float retangulo = A*B;
			System.out.printf(" a área do retângulo que tem lados A e B: %.3f%n", retangulo);
			
	
		}
	}
}
