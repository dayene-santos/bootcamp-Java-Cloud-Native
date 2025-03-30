import java.util.Locale;
import java.util.Scanner;

public class BancoTerminal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do Saldo: ");
		double saldo = sc.nextDouble();
		
		System.out.print("Digite o valor para saque: ");
		double valorSolicitado = sc.nextDouble();
		
		if(saldo >= valorSolicitado) {
			saldo = saldo - valorSolicitado;
			System.out.println("Saldo atual: " + saldo);
		} else {
			System.out.println("Saldo Insuficiente.");
		}
	
		
		sc.close();
	}

}
