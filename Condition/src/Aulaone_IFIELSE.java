import java.util.InputMismatchException;
import java.util.Scanner;

public class Aulaone_IFIELSE {
	void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int hora;
			System.out.println("Quantas horas???");
			hora = sc.nextInt();

			if (hora >= 6 && hora <= 11) 
			{
				System.out.println("Bom Dia");
			} 
			else if (hora >= 12 && hora <= 18) 
			{
				System.out.println("Boa Tarde");
			} 
			else if (hora >= 18) 
			{
					System.out.println("Boa Noite");
					
			}
			else if(hora <= 5) {
				System.out.println("Boa Noite");
			}
			
			else {
				System.out.println("Hora errada!");
			}
		}
		catch(InputMismatchException e) {
			
			System.err.println("Não Pode Letras");
		}
	}
}
