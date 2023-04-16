package Lista_2;

/*9) A conversão de graus Farenheit para Centígrados é obtida por c = 5/9*(f-32). Faça uma 
Programa chamado “Programa9” que calcule e escreva uma tabela de graus 
Centígrados e graus Farenheit. A tabela começa no grau 0 (zero) centígrado e vai até 
40 graus centígrados, apresente os respectivos graus Farenheit. 
*/

public class Programa9 {
	//Formula para determinar °F: °F = (c*1.8)+32
	
	public static void main(String[] args) {
		float celcius = 0.00f;
		float fahren = (0.00f);
		int contador = 0;
		
		System.out.println("Tabela de conversãod e Celsious para Farenheit:\n");
		do {
			fahren = (float)/*Torna valor float*/((celcius*1.8)+32);
			System.out.println("Graus Celcius: "+celcius+" | "+"Graus Farenheit: "+fahren+"\n");
			celcius++;
			contador++;
		}while(contador <= 40);
		
	}

	
}
