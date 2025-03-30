import java.util.Locale;
import java.util.Scanner;

public class Saldo {

    public static void main(String[] args) {
       
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);

    	System.out.print("Insira o saldo inicial: ");
    	double saldoInicial = sc.nextDouble();

    	System.out.println("Insira os valores das transações: ");
        double valor1, valor2, valor3;
        
        valor1 = sc.nextDouble();
        valor2 = sc.nextDouble();
        valor3 = sc.nextDouble();

        double saldoFinal = saldoInicial + valor1 + valor2 + valor3; 
        
        System.out.printf("%.2f\n", saldoFinal);

        sc.close();
    }
}