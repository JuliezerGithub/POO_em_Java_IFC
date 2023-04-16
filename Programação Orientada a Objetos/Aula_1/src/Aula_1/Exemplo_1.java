package Aula_1;
/* Data 07/03/2023
 * Desenvolvedor: Juliezer
 * Descrição: Class de exemplo em Java;
 */
public class Exemplo_1 {

	public static void main(String[] args)
	{
		// Método de impressão na tela/console
		//System.out.println("Hello World!!");
	
		//Tipo primitivo de Dados
		//Declaração tipo inteiro
		byte x3 = 127; //byte
		short x1 = 1; //short
		long x2 = 99999999L;//É necessário colocar o L no final
		System.out.println("As variáveis são:\nx1: "+x1+"\nx2: "+x2+"\nx3: "+x3);
		//Fracionários
		float y = 4.5f; //Quatro casas decimais
		double y1 = 9999999.9d; //armazena 8 bytes
		System.out.println("As variáveis são:\ny: "+y+"\ny1: "+y1);
		//caracter
		var a = 'a';
		System.out.println("A variável var 'a' é: "+a);
		//Lógico
		var b = true;
		System.out.println("A variável var 'b' é: "+b);
		
		//Tipo abstrato de Dados
		//Cadeia de Caracteres
		String nome = "Juliezer da Silva";
		System.out.println("Meu nome é "+nome);
		//Cast
		double d = 4.999d;
		float f = 4.9f;
		int i = (int)f;
		int i1 = (int)d;
		
		System.out.println("Resultado: i = "+i+"\ni1 ="+i1); //cast não faz arredondamento
		
		//declaração multipla
		int h=2,j=9,l=10;
		System.out.println("As variáveis são:\nh: "+h+"\nj: "+j+"\nl: "+l);
	}
	
}
