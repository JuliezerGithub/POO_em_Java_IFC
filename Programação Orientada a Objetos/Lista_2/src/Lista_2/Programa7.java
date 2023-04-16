package Lista_2;

import java.util.Scanner;

/*7) Escreva uma Programa chamado “Programa7” que receba um conjunto de valores 
inteiros e positivos, calcule e imprima o maior e o menor valor do conjunto. Para 
encerrar a entrada de dados, deve ser digitado o valor zero. Para valores negativos, 
deve ser enviada uma mensagem. Esses valores (zero e negativos) não entrarão nos 
cálculos. */

public class Programa7 {
	public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
		
		/*Integer é uma classe Wrapper do tipo primitivo int, ou seja, uma tipologia que quando você declara não é inicializada pela linguagem. O integer aceita o mesmo tipo de valores que a o int.
		 * Quando você cria uma variável int e não define nenhum valor, ela é automaticamente definida como , mas e se você quiser saber se ela está sem nenhum valor sabendo que 0 também pode ser uma possibilidade? 
		 * É ai que entra o Integer.Sua principal diferença é que, na declaração, Integer começa com letra maiúscula e possibilita a declaração de valores nulos. Sendo assim, mesmo que o usuário digitou 0 você saberá que ele digitou algo. 
		 * Caso não tenha digitado nada a variável traz um valor nulo ("null). 
		*/
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		System.out.print("Digite um valor inteiro positivo (ou 0 para encerrar): ");
		int valor = scanner.nextInt();

		while (valor != 0) {
		    if (valor < 0) {
		        System.out.println("Valor inválido. Digite novamente.");
		    } else {
		        if (valor > maior) {
		            maior = valor;
		        }
		        if (valor < menor) {
		            menor = valor;
		        }
		    }
		    System.out.print("Digite um valor inteiro positivo (ou 0 para encerrar): ");
		    valor = scanner.nextInt();
		}
		
		if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {//Se o usuário não digitar nenhum valor:
		    System.out.println("Nenhum valor válido foi digitado.");
		} else {//Mostrando os valores:
		    System.out.println("Maior valor: " + maior);
		    System.out.println("Menor valor: " + menor);
		}
	}
}
}
