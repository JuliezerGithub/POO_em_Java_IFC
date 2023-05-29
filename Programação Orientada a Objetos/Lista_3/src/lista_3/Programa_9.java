package lista_3;
import java.util.Arrays;
import java.util.Scanner;
/*9. Crie um programa que receba um vetor de 10 nomes do usuário. Imprima em ordem alfabética.*/
public class Programa_9 {
	public static void main(String[] args) {
        String[] nomes = new String[10];
        try (Scanner scanner = new Scanner(System.in)) {
			// Preenche o vetor com os nomes informados pelo usuário
			for (int i = 0; i < nomes.length; i++) {
			    System.out.print("Digite o nome " + (i + 1) + ": ");
			    nomes[i] = scanner.nextLine();
			}
		}

        // Ordena os nomes em ordem alfabética
        Arrays.sort(nomes);

        // Imprime os nomes em ordem alfabética
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
