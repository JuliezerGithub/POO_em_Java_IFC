package Lista_2;

import java.util.Scanner;

/*10) Faça um Programa chamado “Programa10” que receba, como entrada, uma lista de 
números positivos ou negativos finalizada com o número zero e forneça, como 
saída, a soma dos números positivos, a soma dos números negativos e a soma das 
duas somas parciais. */

public class Programa10 {
	
	public static void main(String [] args) {
		try (Scanner entrada = new Scanner(System.in)){
			
			int valor = 0;
			int negativo = 0;
			int somanegativo = 0;
			int positivo = 0;
			int somapositivo = 0;
			
			System.out.println("Digite um valor, e será mostrado a soma dos positivos e negativos, assim como a soma parcial dos valores: \n");
			valor = entrada.nextInt();
		while(valor != 0) {
			if (valor < 0) {
				somanegativo = negativo - valor;
				negativo = somanegativo;
			}else {
				somapositivo = positivo + valor;
				positivo = somapositivo;
			}
			System.out.println("Digite um valor, e será mostrado a soma dos positivos e negativos, assim como a soma parcial dos valores: \n");
			valor = entrada.nextInt();
		}
			//Mostrando os valores:
		    System.out.println("Soma valores positivos: " + somapositivo);
		    System.out.println("Soma valores negativos: " + somanegativo*(-1));
		    System.out.println("Soma dos valores parciais: " + (somapositivo+(somanegativo*(-1))));
		}
	}
}

