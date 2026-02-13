import java.util.Locale;
import java.util.Scanner;

public class exercicio_ten {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            double horas = sc.nextDouble();
            double totalPagar = 5.0; // Começa com o valor fixo das primeiras 2h
            double restante = horas;

            if (horas > 2) {
                restante -= 2; // Já cobramos as primeiras 2h (os 5 reais)

                // Gaveta 2: de 2h até 5h (espaço de 3 horas)
                if (restante <= 3) {
                    totalPagar += restante * 3.0;
                    restante = 0;
                } else {
                    totalPagar += 3.0 * 3.0; // Encheu a gaveta (R$ 9,00)
                    restante -= 3; // Passa o que sobrou para a última gaveta
                }

                // Gaveta 3: acima de 5h total
                if (restante > 0) {
                    totalPagar += restante * 10.0; // Cada hora custa 10 reais
                }
            }

            System.out.printf("R$ %.2f%n", totalPagar);
        }
    }
}
