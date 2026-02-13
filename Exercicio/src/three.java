import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class three {
	static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int number, hours;
			double salary;
			System.out.println("Qual o numero do funcionario? ");
			number = sc.nextInt();
			
			System.out.println("Quantas horas trabalhadas? ");
			hours = sc.nextInt();
			
			Locale.setDefault(Locale.US);
			System.out.println("Quanto ele ganha p/ hora? ");
			salary = sc.nextDouble();
		
			System.out.println("Number: " + number);
			
			System.out.println("Salary: " + salary*hours);
			
			System.out.println("Work hours: " + hours);
			
			
		}
		catch(InputMismatchException e) {
			System.out.println("Não pode '.' 'strings', use virgula e apenas números");	
		}
	}
}
