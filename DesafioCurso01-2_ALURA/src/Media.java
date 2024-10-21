import java.util.Locale;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;

        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        sc.close();
    }
}