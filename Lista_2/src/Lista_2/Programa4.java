package Lista_2;

import java.util.Scanner;

public class Programa4 {
	public static void main(String[] arg) {// Recebe o número digitado pelo usuáio
        int num = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um número para saber os próximos 10 números pares: ");
            num = sc.nextInt();
        }
        int valor = 2; 
        int contador = 0;
        while (contador <= 8) {//Enquanto contador for menor que 10 repete o laço e conta mais um
        	valor = valor * num;
            System.out.println("\n " + valor);//Mostra o valor na tela
            valor++;
            contador++;
        }
        
}
}
