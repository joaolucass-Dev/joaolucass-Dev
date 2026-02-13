import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class One {
	// 1. O main deve ser static e ter o "public" (em versões padrão do Java)
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		// O try-with-resources fica fora para gerenciar o Scanner
		try (Scanner sc = new Scanner(System.in)) {
			boolean continuar = true;

			while (continuar) {
				try {
					System.out.println("\n-------SOMA DE DOIS NÚMEROS--------");

					System.out.print("Digite o primeiro valor: ");
					int a = sc.nextInt();

					System.out.print("Digite o segundo valor: ");
					int b = sc.nextInt();

					int soma = a + b;
					System.out.println("A soma desses valores é: " + soma);

					// 2. O 'continuar' recebe o que o método retorna
					continuar = perguntarSeContinua(sc);

				} catch (InputMismatchException e) {
					System.err.println("UEPA!! NÃO PODE LETRAS.");
					sc.next(); // Limpa o buffer para o próximo ciclo
				}
			}
		}
	}

	// 3. O método deve ser static para o main conseguir chamar
	// 4. Ele deve retornar boolean (true ou false)
	public static boolean perguntarSeContinua(Scanner sc) {
		System.out.print("\nDeseja calcular novamente? (s/n): ");
		String answer = sc.next();
		return answer.equalsIgnoreCase("s");
	}
}