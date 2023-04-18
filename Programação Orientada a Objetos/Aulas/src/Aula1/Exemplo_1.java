package Aula1;
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
		int x = 1; //Declaração tipo inteiro
		byte x3 = 127; //byte
		short x1 = 1; //short
		long x2 = 99999999L;//É necessário colocar o L no final
		
		//Fracionários
		float y = 4.5f; //Quatro casas decimais
		double y1 = 9999999.9d; //armazena 8 bytes
		
		//caracter
		char a = 'a';
		
		//Lógico
		boolean b = true;
		
		//Tipo abstrato de Dados
		//Cadeia de Caracteres
		String nome = "Juliezer da Silva";
		
		//Cast
		double d = 4.999d;
		float f = 4.9f;
		int i = (int)f;
		int i1 = (int)d;
		
		System.out.println("Resultado: "+i+" !!!!!"); //cast não faz arredondamento
		
		//declaração multipla
		int h=2,j=9,l=10;
	}
	
}
