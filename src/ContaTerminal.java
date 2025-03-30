import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int conta, agencia;
		String nomeCliente;
		double saldo;
		
		System.out.print("Por favor, digite o número da Agência: ");
			agencia = sc.nextInt();
		
		System.out.print("Por favor, insira o número da Conta: ");
			conta = sc.nextInt();
			sc.nextLine();
		
		System.out.print("Digite seu nome: ");
			nomeCliente = sc.nextLine();
			
		System.out.print("Digite o valor que irá depositar: ");
			saldo = sc.nextDouble();
			
		
		System.out.printf("Olá %s, obrigada por criar uma conta em nosso banco, sua agência é %d, conta %d, e seu saldo R$%.2f já está disponível para saque. ", nomeCliente, agencia, conta, saldo);
				
		sc.close();

	}

}
