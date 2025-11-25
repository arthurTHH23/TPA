package prjAula09;
import java.util.Scanner;

public class IdadeAlturaPeso {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, idadeSup=0, totalPessoas=0, maisVelho=0, maisNovo=999, i;
		double altura, peso, mediaAltura, totalAltura=0, pessoasLeve=0, percPessoasLeves;
		
		for (i=0; i<5; i++) {
			System.out.println("Digite a sua idade:");
			idade = ler.nextInt();
			System.out.println("Digite a sua peso:");
			peso = ler.nextDouble();
			System.out.println("Digite a sua altura:");
			altura = ler.nextDouble();
			
			if (idade>50)
				idadeSup = idadeSup+1;
			if (idade>9 & idade<21)
				totalPessoas = totalPessoas+1;
				totalAltura = totalAltura+altura;
			if (peso<40)
				pessoasLeve = pessoasLeve+1;
			if (idade<maisNovo)
				maisNovo = idade;
			if (idade>maisVelho);
				maisVelho = idade;
		}
		percPessoasLeves = (pessoasLeve/5)*100;
		mediaAltura = totalAltura/totalPessoas;
		System.out.println("Tem "+idadeSup+" com idade superior a 50");
		System.out.println("A média da altura das pessoa com idade entre 10 e 20 é "+mediaAltura);
		System.out.println(percPessoasLeves+"% é a porcentagem de pessoas com menos de 40kg");
		System.out.println("A idade da pessoa mais nova é "+maisNovo+" e a pessoa mais velha é "+maisVelho);
		ler.close();
	}

}
