package Lista_2;

import java.util.Scanner;

/*7) Escreva uma Programa chamado “Programa7” que receba um conjunto de valores 
inteiros e positivos, calcule e imprima o maior e o menor valor do conjunto. Para 
encerrar a entrada de dados, deve ser digitado o valor zero. Para valores negativos, 
deve ser enviada uma mensagem. Esses valores (zero e negativos) não entrarão nos 
cálculos. */

public class Programa7 {
	
	//Fazer com For e DoWhile
	void Programa7 (){
		do{
			// variáveis:
			int elementos = 0;
			int entrada = 0;
			int valormenor = 0;
			int valormaior = 0;
			int i = 0;

			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Digite o número de elementos que serão comparados: ");
				elementos = sc.nextInt();
			

			if (valormaior == 0){ //atribui a entrada como maior valor no primeiro ciclo
				valormaior = entrada;
				valormenor = entrada;
			
			} else if (valormenor < valormaior){
				valormenor = entrada;
				System.out.println("Valor menor: "+valormenor);
			} else {
				valormaior = entrada;
				System.out.println("Valor maior: "+valormaior);
			}
		

		
		
		}
		i++;
	}
		while(i < elementos);
	}
	public static void main(String[] args) {
		Programa7 rodar = new Programa7();
		rodar.Programa7();


	}
}

