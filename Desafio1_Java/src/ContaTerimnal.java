import java.util.Scanner;

public class ContaTerimnal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor digite o número da conta");
        int conta = scan.nextInt();
        scan.nextLine(); // Limpar o buffer após o próximo inteiro

        System.out.println("PRESS ENTER");
        scan.nextLine(); // Aguardar pelo Enter (limpar a linha em branco)

        System.out.println("Por favor digite o número da agencia");
        String agencia = scan.nextLine();

        System.out.println("PRESS ENTER");
        scan.nextLine();

        System.out.println("Por favor digite o seu nome");
        String nomeCliente = scan.nextLine();

        System.out.println("PRESS ENTER");
        scan.nextLine();

        System.out.println("Por favor digite o saldo da conta");
        double saldo = scan.nextDouble();
        scan.nextLine(); // Limpar o buffer após o próximo número

        System.out.println("PRESS ENTER");
        scan.nextLine();

        System.out.println(String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeCliente, agencia, conta, saldo));
    }
}
