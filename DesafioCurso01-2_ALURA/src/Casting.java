import java.util.Locale;
import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numeroDouble = sc.nextDouble();
        int numeroInteiro = (int) (numeroDouble);

        System.out.println("Casting de double para int: " + numeroInteiro);

        sc.close();
    }
}
