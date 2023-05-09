package Aula2;

public class Exemplo1 {

	public static void main(String[] args) {
		// Manipulação de Strings
		String nome = "Elian";// reutiliza espaço da memoria mesmo valor salva junto
		String nome1 = new String("Elian");// memoria para cada 1.
		
		char[] temp = {'E','l','i','a','n'};
		String nome2 = new String(temp);
		
		//Comparação de Strings
		System.out.println(nome+" - "+nome1);
		//Comparando memória
		System.out.println("Igual : "+(nome==nome1));
		//Compara e difere maiúsculo e minusculo
		System.out.println("Igual : "+(nome.equals(nome1)));
		//Compara ignorando maiúscula e minusculo
		System.out.println("Igual : "+(nome.equalsIgnoreCase(nome1)));
		
		//CompareTo
		String a = "abc!", b = "abc !";
		System.out.println(" a compareTo b:"+a.compareTo(b));
		//valor < 0 - 1° String é menor que a 2°
		//valor > 0 - 1° String é maior que a 2°
		//valor = 0 - as duas Strings são iguais
		
		//Concatenar
		String nova = a+" - "+b;
		String nova1 = a.concat(" = ");
		
		//Dividir - Separação
		String frase = "Hoje é terça-feira";
		String[] vetor = frase.split(" ");
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		
		//Tamanho da String
		int qtd = frase.length();
		System.out.println(qtd);
		
		
		//CharAt
		//Verificar se uma letra/caracter existe em uma posição
		System.out.println(frase.charAt(0));
		boolean r = (frase.charAt(0)+"").equals("H");
		System.out.println(r);
		
		//SubString
		//Retorna um pedaço da string
		System.out.println(frase.substring(4));//apartir do numero inicio e inteiro
		System.out.println(frase.substring(0,4));// inicio e fim palavra
		System.out.println(frase.substring(0,1));// uma letra
		
		//Maiúsculo frase
		System.out.println(frase.toUpperCase());
		//Minúsculo frase
		System.out.println(frase.toLowerCase());
		
		//Replace
		//substituir
		System.out.println(frase.replace("e", "i"));
		System.out.println(frase.replace("terça", "quarta"));
		
		//IndexOf
		//Retorna o índice da primeira ocorrência
		System.out.println(frase.indexOf("e"));
		//Retorna o índice da última ocorrência lastIndexOf 
		System.out.println(frase.lastIndexOf("feira"));
		//Retorna a primeira ocorrência apartir de um índice
		System.out.println(frase.indexOf("e",3));// explicar
		
		
		//converções
		
		int x = 45;
		double d = 1.45d;// sempre coloca d no final
		Double d1 = new Double(1.45);// mesma coisa
		String s = x +"";//transforma em uma String
		String s1 = d1.toString();// Objeto para String
		
		String a1 = "1.14";
		double b1 = Double.parseDouble(a1); //convertendo uma String em double
		String z = "1000";
		int f = Integer.parseInt(z);
		
		
		
		
		
		
	}

}
