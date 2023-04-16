package Lista_2;
import java.util.Scanner;
/*8) Escreva um programa chamado “Programa8” que leia um número que represente o 
sexo de uma pessoa (0 para Masculino e 1 para feminino). Se for masculino, mostra a 
mensagem “Seja bem-vindo, Senhor!”, se for feminino, mostra a mensagem “Seja 
bem-vinda, Senhora!”*/

public class Programa8 {

public static void main(String[] args) {
	int sexo = Integer.MIN_VALUE;
		try (Scanner entrada = new Scanner(System.in)){
			System.out.println("Qual o seu sexo: \n0 - Masculino\n1 - Feminino");
			sexo = entrada.nextInt();
			
			switch(sexo) {
			case 0: System.out.print("Seja bem-vindo, Senhor!");break;
			case 1: System.out.print("Seja bem-vinda, Senhora!");break;
			}
		}
	}

}
