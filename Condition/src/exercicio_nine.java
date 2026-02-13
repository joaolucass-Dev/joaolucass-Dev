import java.util.Locale;
import java.util.Scanner;

public class exercicio_nine {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Sempre coloque antes de ler o dado!
        
        try(Scanner sc = new Scanner(System.in)) {
            double litros = sc.nextDouble();
            double litrostotal = 0;
            double restante = litros;
            
            // 1. Tira os primeiros 100 (Grátis)
            if (restante > 100) {
                restante -= 100;
                
                // 2. Gaveta dos R$ 0,10 (Cabe 400 litros: do 100 ao 500)
                if (restante <= 400) {
                    litrostotal += restante * 0.10;
                    restante = 0;
                } else {
                    litrostotal += 400 * 0.10; // Cobrou o máximo da gaveta
                    restante -= 400; // Passa o que sobrou para a próxima
                }
                
                // 3. Gaveta dos R$ 0,25 (Tudo que passar de 500 total)
                if (restante > 0) {
                    litrostotal += restante * 0.25;
                }
            }

            if (litrostotal == 0.0) {
                System.out.println("Isento");
            } else {
                System.out.printf("R$ %.2f%n", litrostotal);
            }
        }
    }
}