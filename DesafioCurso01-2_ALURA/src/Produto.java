import java.util.Locale;
import java.util.Scanner;

public class Produto{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoProduto = sc.nextDouble();
        int quantidade = sc.nextInt();

        double total = precoProduto * quantidade;

        System.out.println("O valor total da compra é R$" + total);

        sc.close();
    }
}