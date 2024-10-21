import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o seu tipo de conta (CORRENTE OU POUPANÇA): ");
        String tipoDeConta = sc.nextLine();
        System.out.println("Digite o seu saldo: ");
        double saldo = sc.nextDouble();

        int operacao = 0;

        System.out.println("================================================");
        System.out.println("================DADOS DO CLIENTE================");
        System.out.println("""
                 * NOME: %s
                 * TIPO DE CONTA: %s
                 * SALDO: %f
                """.formatted(nome, tipoDeConta, saldo));

        System.out.println("================================================");
        while (operacao != 4) {
            System.out.println("-----Menu de Operações-----");
            System.out.println("1. Consultar saldos");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            operacao = sc.nextInt();

            if (operacao == 1) {
                System.out.println("Seu saldo atual é: R$" + saldo);
            } else if (operacao == 2) {
                System.out.println("Digite o valor que deseja depositar: ");
                double valor_deposito = sc.nextDouble();
                saldo += valor_deposito;
                System.out.println("Novo saldo: R$" + saldo);
            } else if (operacao == 3) {
                System.out.println("Digite o valor que deseja transferir: ");
                double valor_transferir = sc.nextDouble();

                if (valor_transferir > saldo) {
                    System.out.println("Não é possível realizar transferência. Valor de transferência é maior que o saldo disponível");
                } else {
                    saldo -= valor_transferir;
                    System.out.println("Novo saldo: R$" + saldo);
                }
            } else if (operacao == 4) {
                System.out.println("================================================");
                System.out.println("ENCERRANDO OPERAÇÕES");
                System.out.println("================================================");
            } else {
                System.out.println("Opção inválida, tente outra opção");
            }


        }
    }
}