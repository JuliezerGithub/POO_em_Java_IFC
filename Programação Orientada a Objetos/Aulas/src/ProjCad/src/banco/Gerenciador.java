package banco;

import java.io.*;

public class Gerenciador {

	private final static String banco_alunos = "banco_alunos.txt";
	
	private boolean insere(String banco) 
	{
		//Abre arquivo
		File arquivo = new File(banco);
		
		//Tratamento de erro: Tenta criar se não existe:
		try {
			arquivo.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
}
