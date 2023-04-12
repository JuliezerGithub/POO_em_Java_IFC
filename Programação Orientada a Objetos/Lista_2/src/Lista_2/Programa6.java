package Lista_2;

/*6 Escreva uma Programa chamado “Programa6” que calcule a soma dos números de 1 a 
15. Utilize o comando de repetição Enquanto (While), depois utilize o comando Faça 
Enquanto (Do.. While) e por fim, o comando Para (For). 
*/

public class Programa6 {
	
	public static void main(String [] args) 
	{	
		Variaveis valores1 = new Variaveis();
			valores1.vinicial = 1;
			valores1.vfinal = 15;
			valores1.contador = 1;
			valores1.metodo = "While";
		Variaveis valores2 = new Variaveis();
			valores2.vinicial = 1;
			valores2.vfinal = 15;
			valores2.contador = 1;
			valores2.metodo = "Do While";
		Variaveis valores3 = new Variaveis();
			valores3.vinicial = 1;
			valores3.vfinal = 15;
			valores3.contador = 1;

		valores1.medotoWhile();
		valores2.metodoDoWhile();
	}
}
