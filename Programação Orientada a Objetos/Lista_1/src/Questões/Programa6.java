package Questões;

import java.util.Scanner;

/*6. Crie uma classe java com o nome “Programa6” que leia o valor do salário mínimo e o
valor do salário de um usuário, calcule a quantidade de salários mínimos esse usuário
ganha e imprima o resultado. (1 salário mínimo = R$954,00)*/

public class Programa6 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("\nQual é o valor do salário mínimo atual: ");
			float salario = scanner.nextFloat();
			System.out.println("\nQual é o valor do seu salário: ");
			float salariousuario = scanner.nextFloat();
			
			float ganha = salariousuario/salario;
			System.out.println("\nVocê ganha o equivalente à: "+ganha+" salários mínimos");
			
		}
	}

}
