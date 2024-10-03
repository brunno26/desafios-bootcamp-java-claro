import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Informe o número da conta: ");
        int conta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Informe o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        double saldo = 237.48;

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua Agência é: Agência: " + agencia + " Conta: " + conta + " e seu saldo é Saldo: " + saldo );

    }
}
