package prjAulaVetores;
import java.util.Scanner;

public class VetorMedia {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[], media=0, i;
		a = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o valor "+(i+1)+" do vetor A");
			a[i] = ler.nextInt(); 
			media = media + a[i];
		}
		media = media/10;
		System.out.println("A média do vetor A é: "+media);
		ler.close();
	}

}
