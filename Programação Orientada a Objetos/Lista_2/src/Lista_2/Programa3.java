package Lista_2;
import java.util.Scanner;
public class Programa3 {
	public static void main(String[] arg) {// Recebe o número digitado pelo usuáio
        float num = 0.0f;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um número para saber os próximos 10 números pares: ");
            num = sc.nextFloat();
        }
        if (num % 2 == 0) {
            System.out.println("\nO numero " + num + " é par!");
            int contador = 0;
            while (contador <= 10) {//Enquanto contador for menor que 10 repete o laço e conta mais um
                num = num + 2;
                System.out.println("\n " + num);

                contador++;
            }
        } else {
            System.out.println("\nO numero " + num + " é impar. Reinicie o programa e insira um valor par!");
        }
    }
}
