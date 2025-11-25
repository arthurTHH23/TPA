package prjAulaVetores;
import java.util.Scanner;

public class VetorQuadrado {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		final int TAM=10;
		int a[], b[], i;
		a = new int [TAM];
		b = new int [TAM];

		for (i=0; i<TAM; i++) {
			System.out.println("Digite o valor "+(i+1)+" do vetor A");
			a[i] = ler.nextInt();
			b[i] = a[i]*a[i];
		}
		System.out.print("\nB = [ ");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		ler.close();
	}

}
