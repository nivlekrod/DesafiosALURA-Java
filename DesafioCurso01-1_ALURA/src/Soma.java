import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2, soma;

        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        soma = numero1 + numero2;

        System.out.println("Resultado da soma é " + soma);
    }
}
