package Aula2;

public class Exemplo1 {
	//Manipulação de String
		String nome = "Juliezer";
		String nome1 = new String("Juliezer");
		
		char [] temp = {'J', 'u','l','i','e','z','e','r' };
		String nome2 = new String(temp);
		//Comparando Caractere
		System.out.println(nome+" - "+nome1);
		//Compara e difere Maiúsculas e Minusculas
		System.out.println("Igual : "+ (nome==nome1));
		//Compara e ignora Maiúsculas e Minusculas
		System.out.println("Igual : "+ (nome.equals(nome1)));

		//CompareTo
		String a = "IFC !", b = "ifc!";
		System.out.println("a compareTo b:"+a.compareTo(b));
		// valor < 0 - 1ª String é menos que a 2ª
		// valor > 0 - 1ª String é menor que a 2ª
		// valor = 0 - as duas Strins são iguais
		
		//Concatenar
		String nova = a+" - "+b;
		String nova1 = a.concat(" - ");
			
		//Dividir - Separação
		String frase = "Hoje é terça-feira";
		String[] vetor = frase.split(" ");

		//CharAt
		//Verificar se uma letr/caracter existe em uma posição
		System.out.println(frase.CharAt(0));
		boolean r = (frase.charAt(0)+"").equals("H");
		System.out.println(r);

		//SubString
		//Retorna um pedaço da String
		System.out.println(frase.SubString(4));
		System.out.println(frase.SubString(0,4));

		//Maiúsculo
		System.out.println(frase.toUpperCase());
		//Minúsculo
		System.out.println(frase.toLowerCase());

		//raplace
		//substituir
		System.out.println(frase.raplace("e", "i"));
		System.out.println(frase.raplace("terça", "quarta"));

		//IndexOf
		//Retorna o indice da primeira ocorrencia
		System.out.println(frase.IndexOf("e"));
		//Retorna o indice da ultima ocorrencia
		System.out.println(frase.lastIndexOf("e"));
		//Retorna a próxima ocorrencia a partir do indice da primeira ocorrencia
		System.out.println(frase.IndexOf("e"));
	}
