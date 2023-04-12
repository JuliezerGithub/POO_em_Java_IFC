package Questões;

import java.util.Scanner;

/*5. Crie uma classe java com o nome “Programa5”. O programa deve receber um valor de
saldo e imprimir o saldo com reajuste de 5%. 
*/

public class Programa5 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("\nQual é o saldo da sua conta: ");
			float saldo = scanner.nextFloat();
			saldo = (float) (saldo*1.05);
			System.out.println("\nO saldo reajustado é R$ "+saldo);
		}
	}

}
