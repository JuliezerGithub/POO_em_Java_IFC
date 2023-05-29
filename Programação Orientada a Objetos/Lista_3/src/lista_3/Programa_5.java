package lista_3;

/*
5. Escreva um programa que inicializa um array 10 de inteiros a e devolve um array de boolean
onde, cada posição indique true se o elemento da posição correspondente é positivo e false caso
seja negativo ou zero.
*/
public class Programa_5 {
	public static void main(String[] args) {
		int valores[] = {1,-2,3,-4,5,-6,7,-8,9,-10};
		boolean [] resultados = verificaValor(valores);
		for (boolean resultado : resultados) {
			System.out.println(resultado);
		}		
	}

	public static boolean[] verificaValor(int[] p) {
		boolean[] resultados = new boolean[p.length];
		for(int i = 0 ;  i < p.length ; i++ ) {
			if(p[i] > 0) {
				resultados[i] = true;
			}else {
				resultados[i] = false;
			}
	}
		return resultados;
	}
}