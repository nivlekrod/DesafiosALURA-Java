import java.util.Locale;
import java.util.Scanner;

public class ConversorDolaresReais {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorEmDolares = sc.nextDouble();
        double taxaDeConversao = sc.nextDouble();

        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.println("O valor em reais é: " + valorEmReais);

        sc.close();
    }
}