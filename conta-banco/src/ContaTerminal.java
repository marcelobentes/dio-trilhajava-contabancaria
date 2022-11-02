import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner 32entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = entrada.next();
        System.out.println("Por favor informe o número da conta: ");
        numero = entrada.nextInt();
        System.out.println("Por favor informe o nome do Cliente: ");
        nomeCliente = entrada.next();
        System.out.println("Por informar valor de deposito: ");
        saldo = entrada.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+"e seu saldo R$ "+saldo+" ja esta disponivel para saque.");


    }
}
