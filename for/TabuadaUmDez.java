package prjAula09;

public class TabuadaUmDez {

	public static void main(String[] args) {
		int i, resultado, n;
		
		for (n=1; n<11; n++) {
			System.out.println("");
			for (i=1; i<11; i++) {
			resultado = i*n;
			System.out.println(i+"x"+n+"="+resultado);
			}
		}

	}

}
