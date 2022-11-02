import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = entrada.next();
        System.out.println("Por favor informe o número da conta: ");
        numero = entrada.nextInt();
        System.out.println("Por favor informe o nome do Cliente: ");
        nomeCliente = entrada.next();
        System.out.println("Por informar valor de deposito: ");
        saldo = entrada.nextDouble();


    }
}
