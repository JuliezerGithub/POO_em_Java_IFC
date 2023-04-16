package Lista_2;

/*6) Escreva uma Programa chamado “Programa6” que calcule a soma dos números de 1 a 
15. Utilize o comando de repetição Enquanto (While), depois utilize o comando Faça 
Enquanto (Do.. While) e por fim, o comando Para (For). 
*/

public class Programa6 {
	
	public static void main(String [] args) 
	{
			
		//Declarando as variáveis
		int Inicial = 1, Final = 15;
		int contador1 = 1;
		int contador2 = 1;
		
		System.out.println("Calculo usando wilhe: ");
		while (contador1 <= 14) {
		Final = Final + Inicial;
		Inicial++;
		contador1++;
		}
		System.out.println("A soma de 1 até 15 é: "+Final);
		
		Inicial = 1;
		Final = 15;
		System.out.println("\nCalculo usando Do While: ");
		
		do {
			Final = Final + Inicial;
			Inicial++;
			contador2++;	
		}
		while(contador2 < 15);
		System.out.println("A soma de 1 até 15 é: "+Final);	
		
	}
	
}
