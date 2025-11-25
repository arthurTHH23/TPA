package prjAula08;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=1;
		double fatorial=1, n;
		
		System.out.println("Digite o número a ser fatorado:");
		n = ler.nextDouble();
		
		do {
			fatorial = fatorial*i;
			i++;
			
		} while (i<=n);
		System.out.println("Seu fatorial é "+fatorial);
		ler.close();
	}

}
