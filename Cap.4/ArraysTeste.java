public class ArraysTeste {
	public static void main(String args[]) {
		/* Definição de array multidimensional */
		double[][] notas = new double[2][4];
		notas[0][0] = 8.0;
		notas[0][1] = 7.5;
		notas[0][2] = 9.0;
		notas[0][3] = 8.5;
		notas[1][0] = 9.5;
		notas[1][1] = 8.5;
		notas[1][2] = 8.0;
		notas[1][3] = 9.0;

		System.out.println("\n");
		/* println imprime linha em braco com a quebra de linha e salto de linha "\n" */

		/* l = índice que será utilizado para indicar as linhas [2] */
		/* c = índice que será utilizado para indicar as colunas [4] */
		/* observe também o aninhamento do laço for (for dentro de for) */
		
		for(int l=0; l<notas.length; l++) {
			for(int c=0; c<notas[l].length; c++) {
				System.out.print(l + " e " + c + " = " + notas[l][c] + "\t");
				/* print imprime as notas sem quebra de linha, mas com tabulação "\t" */
			}
			System.out.println("\n");
			/* println imprime linha em branco com a quebra e salto de linha "\n" */
		}	
	}
}
		