package prjAula08;

import java.util.Scanner;

public class ExUsuarioEscolhe {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i=1;
		double n1, n2, m;
		
		do {
			System.out.println ("Digite a primeira nota do aluno");
			n1 = ler.nextDouble ();
			System.out.println ("Digite a segunda nota do aluno");
			n2 = ler.nextDouble();
			m = (n1+n2)/2;
			System.out.println ("A nota do aluno é: "+m);
			System.out.println ("\nDeseja continuar ? 1-Sim / 2-Não");
			i = ler.nextInt();
			
		} while (i==1);
		ler.close();
	}

}
