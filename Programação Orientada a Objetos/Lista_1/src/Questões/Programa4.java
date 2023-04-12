package Questões;
/*4. Crie uma classe java com o nome “Programa4” que leia 6 números. Faça a média
aritmética dos 3 primeiros números e dos 3 últimos números. Depois some as duas
médias e por fim apresente as médias e sua soma. */
import java.util.Scanner;

public class Programa4 {

	public static void main(String[] args) {
		
		float num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\nDigite um valor para o 1º Número: ");
			num1 = sc.nextFloat();
			
			System.out.println("\nDigite um valor para o 2° Número: ");
			num2 = sc.nextFloat();

			System.out.println("\nDigite um valor para o 3° Número: ");
			num3 = sc.nextFloat();

			System.out.println("\nDigite um valor para o 4° Número: ");
			num4 = sc.nextFloat();

			System.out.println("\nDigite um valor para o 5° Número: ");
			num5 = sc.nextFloat();

			System.out.println("\nDigite um valor para o 6° Número: ");
			num6 = sc.nextFloat();
		
			float soma = (num1 + num2 + num3)/3;
			float soma2 = (num4 + num5 + num6)/3;
			float soma3 = soma + soma2;
			
			System.out.println("\nO valor da primeira média é: "+soma);
			System.out.println("\nO valor da segunda média é: "+soma2);
			System.out.println("\nA soma das médias é: "+soma3);
		}
	}
}

