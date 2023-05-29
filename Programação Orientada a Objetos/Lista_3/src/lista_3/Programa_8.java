package lista_3;
/*8. Crie um programa que inicialize um array de 10 inteiros, e some os valores iniciais com os finais,
criando um vetor de 5 inteiros. Imprima ele na tela.*/
public class Programa_8 {
	 public static void main(String[] args) {
	        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int[] resultado = new int[5];

	        for (int i = 0; i < resultado.length; i++) {
	            resultado[i] = numeros[i] + numeros[numeros.length - 1 - i];
	        }

	        System.out.println("Vetor resultante:");
	        for (int numero : resultado) {
	            System.out.println(numero);
	        }
	    }
}
