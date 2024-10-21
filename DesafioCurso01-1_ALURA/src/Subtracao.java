import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2, subtracao;

        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        subtracao = numero1 - numero2;

        System.out.println("Resultado da subtração é " + subtracao);
    }
}
