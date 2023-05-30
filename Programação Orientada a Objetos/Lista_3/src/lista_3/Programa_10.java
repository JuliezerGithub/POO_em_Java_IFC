package lista_3;
/*10. Crie um programa que receba um nome, e coloque cada letra do nome dentro de uma posição de
um vetor. Faça o vetor imprimir em ordem inversa.*/
import java.util.Scanner;

public class Programa_10 {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
				// Preenche o vetor com o nome informado
				System.out.println("Digite um nome para inverter a ondem das letras: ");
				String nome = scanner.nextLine();
				
				char[] vetor = new char[nome.length()];
				
				for (int i = 0; i < nome.length(); i++) {
					vetor[i] = nome.charAt(i);
				}
		System.out.println("Invertendo o nome: ");
		for(int i = vetor.length - 1; i >=0; i-- ) {
		System.out.print(vetor[i]);
		}
		}
	}
}

