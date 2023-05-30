package banco;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;

import model.Aluno;

public class Gerenciador {

	private final static String banco_alunos = "banco_alunos.txt";
	
	public boolean insere(Aluno a) 
	{
		//Abre arquivo
		File arquivo = new File(banco_alunos);
		
		//Tratamento de erro: Tenta criar se não existe:
		try {
			arquivo.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try(BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), "UTF-8"))){
		String str;
		while((str = in.readLine()) != null) 
		{
			String vet[] = str.split(";");
			
			if(Integer.parseInt(vet[0])== a.getRa()){
				//Se encontrar um registro academico igual ele retorna false e não cadastra
				return false;
			}
		}
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
		try(Writer saida = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivo,true), StandardCharsets.UTF_8)))
		{
			saida.append(a.toString()+"\n");
			saida.flush();
		}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		return true;
		}

		public LinkedList<Aluno> getAlunos()
		{
			LinkedList<Aluno> alunos = new LinkedList<Aluno>();
			File arquivo = new File(banco_alunos);
			

				try {
					arquivo.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try(BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), "UTF-8"))){
					String str;
					
					while((str = in.readLine()) != null) 
					{
						String vet[] = str.split(";");
						alunos.add(new Aluno(Integer.parseInt(vet[0]),vet[1],vet[2]));
					}
					
				}catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					
				return alunos;
		}
		public Aluno getAlunobyRA(int ra) {
			File arquivo = new File(banco_alunos);
			try(BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), "UTF-8"))){
				String str;
				
				while((str = in.readLine()) != null) 
				{
					String vet[] = str.split(";");
					
					if (Integer.parseInt(vet[0])==ra) {
						Aluno a = new Aluno(ra, vet[1], vet[2]);
						return a;
					}
				}
		} catch(Exception e)
			{
			System.out.println(e.getMessage());
		}
			
		return null;
		}
		
		public void remove(int ra) {
			
			LinkedList<Aluno> alunos = getAlunos();
			int indice=0,aux=0;
			
			for(Aluno a : alunos) {
				
				if(a.getRa()==ra) {
					
					aux = indice;
				}
					indice++;
			}
					alunos.remove(aux);
					
					//Abre o arquivo
					File arquivo = new File(banco_alunos);
					arquivo.delete();//Apaga totalmente os arquivos anteriores
					//Tenta Criar se não existe
					try {
						arquivo.createNewFile();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					try(Writer saida = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivo,true), StandardCharsets.UTF_8)))
					{
						for(Aluno a : alunos) {
						saida.append(a.toString()+"\n");
						}
						saida.flush();
						
					}catch(Exception e) {
							System.out.println(e.getMessage());
						}
					
		}
		
}
