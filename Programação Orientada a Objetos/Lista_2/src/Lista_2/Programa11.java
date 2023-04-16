package Lista_2;

import java.util.Scanner;

/*11) Faça um Programa chamado “Programa11” que leia dois números e apresente um 
menu com 4 opções: 1) Somar os números; 2) Subtrair os números; 3) Multiplicar os 
números; 4) Dividir os números. Leia a opção do usuário e execute a operação e 
apresente o resultado. Caso a opção digitada seja inválida, apresente a mensagem de 
“Opção inválida” para o usuário.*/

public class Programa11 {

	public static void main(String[] args) {
		float valor1 = Integer.MIN_VALUE, valor2 = Integer.MIN_VALUE, gatilho = Integer.MIN_VALUE;
		try (Scanner entrada = new Scanner(System.in)){
			
			//Recebe os valores digitados pelo usuário:
			System.out.println("Digite o primeiro valor: ");
			valor1 = entrada.nextInt();
			System.out.println("Digite o segundo valor: ");
			valor2 = entrada.nextInt();
			
			//O gatilho dispara a execução do SE
			System.out.println("Escolha uma das opções a seguir:"
					+ "\n1) Somar os números "
					+ "\n2) Subtrair os números "
					+ "\n3) Multiplicar os números"
					+ "\n4) Dividir os números");
			gatilho = entrada.nextInt();
	
		if (gatilho == 1) {
			System.out.println("A soma dos valores é: "+(valor1+valor2)); 
			
		} else if (gatilho == 2) {
			System.out.println("A diferença dos valores é: "+(valor1-valor2));
			
		} else if (gatilho == 3) {
			System.out.println("A multiplicação dos valores é: "+(valor1*valor2));	
			
		}else if(gatilho == 4){
			System.out.println("A divisão dos valores é: "+(valor1/valor2));
			
		
		}else{ //Mostra o resultado de uma escolha incorreta:
				System.out.println("Opção inválida");
			}
		}
	}
}