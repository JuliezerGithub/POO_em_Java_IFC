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
            int i = 0;
            while (i <= 10) {
                num = num + 2;
                System.out.println("\n " + num);

                i++;
            }
        } else {
            System.out.println("\nO numero " + num + " é impar. Reinicie o programa e insira um valor par!");
        }
    }
}