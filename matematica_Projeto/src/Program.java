import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		// O try-with-resources DEVE envolver o loop para não fechar o System.in
		// precocemente
		try (Scanner sc = new Scanner(System.in)) {
			boolean continuar = true;

			while (continuar) {
				System.out.println("\n--- MENU DE CÁLCULOS ---");
				double a = lerNumero(sc, "Qual o valor de A? ");
				double b = lerNumero(sc, "Qual o valor de B? ");
				double c = lerNumero(sc, "Qual o valor de C? ");

				// 1. Resolver Bhaskara
				resolverBhaskara(a, b, c);

				// 2. Demonstrar funções Math com os valores digitados
				demonstrarMath(a, b);

				System.out.print("\nDeseja calcular novamente? (s/n): ");
				String resposta = sc.next();
				continuar = resposta.equalsIgnoreCase("s");
			}
		}
	}


	public static double lerNumero(Scanner sc, String mensagem) {
		while (true) {
			try {
				System.out.print(mensagem);
				return sc.nextDouble();
			} catch (InputMismatchException e) {
				System.err.println("UEPA!! NÃO PODE LETRA RAPAAAZ.");
				sc.next(); // Limpa buffer
			}
		}
	}

	// MÉTODO REUTILIZÁVEL: Lógica de Bhaskara
	public static void resolverBhaskara(double a, double b, double c) {
		double delta = Math.pow(b, 2.0) - 4 * a * c;
		System.out.printf("%nDelta calculado: %.2f%n", delta);

		if (delta >= 0 && a != 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("X1: %.4f%n", x1);
			System.out.printf("X2: %.4f%n", x2);
		} else {
			System.err.println("Impossível calcular raízes reais (Delta negativo ou A=0).");
		}
	}

	// MÉTODO REUTILIZÁVEL: Demonstração de outras funções Math
	public static void demonstrarMath(double x, double y) {
		System.out.println("\n--- Demonstração Math ---");

		// Math.sqrt -> Raiz Quadrada
		System.out.println("Raiz quadrada de " + x + " = " + Math.sqrt(x));

		// Math.pow -> Potência
		System.out.println(x + " elevado a " + y + " = " + Math.pow(x, y));

		// Math.abs -> Valor Absoluto (torna positivo)
		System.out.println("Valor absoluto de " + y + " = " + Math.abs(y));
	}
}



/**
📝 Resumo de Aprendizado: Java Essentials
1. Gestão de Recursos (Try-with-resources)
Conceito: Usar try (Scanner sc = ...) garante que o recurso seja fechado automaticamente.

Regra de Ouro: Para System.in, o try deve envolver todo o loop principal. Se fechar o Scanner, você corta o "tubo" de entrada de dados do teclado e o programa não consegue ler mais nada até ser reiniciado.

2. Tratamento de Exceções (Catch)
InputMismatchException: Captura o erro quando o usuário digita texto em vez de número.

Limpeza de Buffer: O comando sc.next() dentro do catch é vital. Ele remove o "lixo" que causou o erro, impedindo que o programa entre em um loop infinito de mensagens de erro.

3. Modularização (Métodos)
DRY (Don't Repeat Yourself): Criamos o método lerNumero para não ter que repetir a lógica de erro para A, B e C.

Assinatura: public static double lerNumero(Scanner sc, String msg) -> Recebe o Scanner e a mensagem, e retorna um número válido.

Single Responsibility: O main delega o cálculo para resolverBhaskara e a exibição para demonstrarMath. Cada parte do código cuida apenas de uma tarefa.

4. Lógica Matemática com java.lang.Math
Math.pow(base, expoente): Potenciação.

Math.sqrt(valor): Raiz quadrada.

Math.abs(valor): Valor absoluto (converte negativos em positivos).

Fail-Fast: Verificamos delta >= 0 && a != 0 antes de calcular para evitar resultados como NaN ou Infinity.

💡 Anotações de "Pulo do Gato" (Dicas Práticas)
Locale.US: Sempre defina no início para evitar que o Java mude entre ponto (.) e vírgula (,) dependendo do computador onde o código rodar.

equalsIgnoreCase("s"): Forma elegante de comparar Strings ignorando se o usuário digitou "S" maiúsculo ou "s" minúsculo.

System.err: Use para mensagens de erro. Visualmente ajuda o usuário a entender que algo saiu do fluxo normal.
 */
