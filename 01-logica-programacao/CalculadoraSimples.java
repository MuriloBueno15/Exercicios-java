
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("           CALCULADORA EM JAVA");
        System.out.println("         Desenvolvida por Murilo");
        System.out.println("========================================");
        System.out.print("Digite o primeiro numero: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = entrada.nextDouble();

        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println("Subtracao: " + (numero1 - numero2));
        System.out.println("Multiplicacao: " + (numero1 * numero2));

        if (numero2 != 0) {
            System.out.println("Divisao: " + (numero1 / numero2));
        } else {
            System.out.println("Nao e possivel dividir por zero.");
        }

        entrada.close();
    }
}
