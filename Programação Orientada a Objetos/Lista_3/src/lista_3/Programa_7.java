package lista_3;
import java.util.Scanner;
public class Programa_7 {
	public static void main(String[] args) {
        int[] numeros = new int[10];
        try (Scanner s = new Scanner(System.in)) {
			// Preenche o array com os números informados pelo usuário
			for (int i = 0; i < numeros.length; i++) {
			    System.out.print("Digite o número da posição " + i + ": ");
			    numeros[i] = s.nextInt();
			}
		}

        // Substitui os elementos ímpares por -1 e os pares por +1
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) { // Verifica se é par
                numeros[i] = 1;
            } else { // Ímpar
                numeros[i] = -1;
            }
        }

        // Imprime o array com os valores substituídos
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
