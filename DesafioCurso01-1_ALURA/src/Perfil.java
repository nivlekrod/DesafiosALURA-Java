import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;

        nome = sc.next();
        System.out.printf("Olá, %s!\n", nome);
        System.out.println("Tudo bem?");
    }
}