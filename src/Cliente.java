import java.util.Locale;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do saldo: ");
			double saldo = sc.nextDouble();
			
			if(saldo > 500) {
				System.out.println("Confortável");
			} else if(saldo >= 0 && saldo < 500) {
				
				System.out.println("Baixo");
			}else {
				System.out.println("Negativado");
			}	
		
		sc.close();	
				
	}

}
