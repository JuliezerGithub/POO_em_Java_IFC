package Lista_2;

import java.util.Scanner;

/*
 * 4) Crie uma classe “Programa4” que receba do usuário um número e apresente a tabuada desse número. (Tabuada de 2 a 10). 
 */

public class Programa4 {
	public static void main(String[] arg) {// Recebe o número digitado pelo usuáio
        int num = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um número para saber a tabuada desse número: ");
            num = sc.nextInt();
        }
        int valor = 2; 
        int contador = 2;
        while (contador <= 10) {//Enquanto contador for menor que 10 repete o laço e conta mais um
        	int tabuada;
        	tabuada= valor * num;
            System.out.println("\n " + tabuada);//Mostra o valor na tela
            valor++;//soma mais um na multiplicação
            contador++;
        }
        
}
}
