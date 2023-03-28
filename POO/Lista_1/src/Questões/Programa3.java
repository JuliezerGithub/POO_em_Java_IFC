package Questões;

import java.util.Date;
import java.util.Scanner;
import java.time.*;

/*3. Crie uma classe java com o nome “Programa3” e construa um algoritmo que leia a
idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15
dias = 1170 dias.)*/

public class Programa3 {

	public static void main(String[] args) {
		
		//Recebe a data de nascimento do usuário
		int ano = 0, mes = 0, dia = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\nEm qual dia você nasceu?");
			dia = sc.nextInt();
			System.out.println("\nEm qual mês você nasceu? (Somente número)");
			mes = sc.nextInt();
			System.out.println("\nQue ano você nasceu?");
			ano = sc.nextInt();
			
			System.out.println("\nVocê nasceu em: "+dia+"/"+mes+"/"+ano);
			
			ano = (ano*365);
			//System.out.println("ano = "+ano);
			mes = (mes*30);
			//System.out.println("mes = "+mes);
			int soma = ano + mes + dia;
			//System.out.println("SOMA = "+soma);
		
		Date date = new Date();
		
		// Retorna a data de Hoje:
		LocalDate localDate = date.toInstant()
		  .atZone(ZoneId.systemDefault())
		  .toLocalDate();
		int anoatual = localDate.getYear();

		int mesatual = localDate.getMonthValue();

		int diaatual = localDate.getDayOfMonth();

		System.out.println("A data de hoje é: "+diaatual+"/"+mesatual+"/"+anoatual);

		//Calcula o valor em dias
		int total = 0;
			
		anoatual = (anoatual*365);
		mesatual = (mesatual*30);
		int soma2 = anoatual + mesatual + diaatual;
		
		total = soma2 - soma;
		
		System.out.println("\nVocê está vivo à: "+total);
		}
		
	}

}