import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);

        System.out.println("O NÚMERO ALEATÓRIO FOI GERADO");
        System.out.println(numeroAleatorio);

        int tentativas = 0;
        int numeroEscolhido = 0;

        while (tentativas <= 5) {
            System.out.println("Digite um número de 0 a 100: ");
            numeroEscolhido = sc.nextInt();
            tentativas++;

            if (numeroEscolhido == numeroAleatorio) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                System.out.println("O número gerado era " + numeroEscolhido);
                break;
            } else if (numeroEscolhido < numeroAleatorio) {
                System.out.println("O número " + numeroEscolhido + " é menor que o número gerado.");
            } else {
                System.out.println("O número " + numeroEscolhido + " é maior que o número gerado.");
            }
        }

        if (tentativas == 5 && numeroEscolhido != numeroAleatorio) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroAleatorio);
        }

        sc.close();
    }
}