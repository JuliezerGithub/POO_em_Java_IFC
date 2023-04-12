package Lista_2;

public class Programa1 {
    /**
     * @param N é o valor até onde vai calcular os números primos
     */
    static void prime_N(int N) {

        // Declarando as variáveis:
        int x = 0, y = 0, confere = 0;

        // Saída no display:
        System.out.println("Os números primos de 0 até " + N + " são:");

        // Uso de for para percorrer os número de 1 até N:
        for (x = 1; x <= N; x++) {

            // Descarta 0 e 1 (Não são primos e nem compostos):
            if (x == 1 || x == 0) {
                continue; // continua em todas as verificações
            }

            // Usando a variável = confere para conferir se é primo:
            confere = 1;

            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    confere = 0;
                    break;
                }
            }
            if (confere == 1) {
                System.out.println(x + " ");
            }
        }
    }

    public static void main(String[] args) {
        int N = 50;

        prime_N(N);
    }

}