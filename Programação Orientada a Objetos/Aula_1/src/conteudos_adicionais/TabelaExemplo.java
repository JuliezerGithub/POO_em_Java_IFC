package conteudos_adicionais;
public class TabelaExemplo {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        
        System.out.println("Celsius\tFahrenheit");
        for (int i = 0; i <= 40; i++) {
            celsius = i;
            fahrenheit = (9.0 / 5.0 * celsius) + 32;
            System.out.println(celsius + "\t" + fahrenheit);
        }}
    }   

