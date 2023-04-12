package Lista_2;

import java.util.Scanner;

/*5) Crie uma classe “Programa5” que receba dois números, X e Y. Apresente o valor de X 
elevado ao valor de Y. 
*/

public class Programa5 {

	public static void main(String [] args ) 
	{
		int X = 0;
		int Y = 0;
		try(Scanner sc = new Scanner(System.in)) {

        System.out.println("Digite um número para X: ");
        X = sc.nextInt();
        System.out.println("Digite um número para Y: ");
        Y = sc.nextInt();
        
		}
		double elevado = 0;
    	elevado = Math.pow(X,Y);	
    	System.out.println("X elevado à Y: "+elevado);
	}
}
