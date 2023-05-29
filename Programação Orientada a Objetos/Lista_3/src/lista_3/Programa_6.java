package lista_3;
/*6. Escreva um programa que inicializa um array de 10 números e devolve a posição onde se
encontra o maior valor do array. Se houver mais de um valor maior, devolver a posição da
primeira ocorrência.*/
public class Programa_6 {
    public static void main(String[] args) {
        int[] num = {5, 35, 3, 1, 12, 36, 15, 7, 20, 1};
        int posicaoMaior = procuraPosicaoMaior(num);
        System.out.println("A posição do maior valor é: " + posicaoMaior);
    }

    public static int procuraPosicaoMaior(int[] array) {
        int posicaoMaior = 0;
        int maiorValor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maiorValor) {
                maiorValor = array[i];
                posicaoMaior = i;
            }
        }
        return posicaoMaior;
    }
}
