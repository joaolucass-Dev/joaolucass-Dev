import java.util.Scanner;

void main() {
	Scanner sc = new Scanner(System.in);
	String nome;
	int idade;
	double renda;

	System.out.println("Qual seu nome? ");

	nome = sc.next();

	System.out.println("Qual sua idade? ");

	idade = sc.nextInt();

	System.out.println("Qual sua renda mensal? ");

	renda = sc.nextDouble();

	System.out.println("Seu nome é: " + nome);
	System.out.println("Sua idade é: " + idade);
	System.out.println("Sua renda mensal é: " + renda);

	sc.close();
}