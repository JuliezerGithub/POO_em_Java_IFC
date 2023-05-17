package Aula5;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
//Apresentação de Mensagem:
		JOptionPane.showMessageDialog(null, "Está uma mensagem!", "Título",JOptionPane.INFORMATION_MESSAGE);
//Etrada de dados:
		String nome = JOptionPane.showInputDialog(null, "informe seu nome","Pergunta", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showConfirmDialog(null, nome);
//Janela de confirmação:
		int resposta = JOptionPane.showConfirmDialog(null, "Você tem mais de 18 anos?");
		Object[] botoes = {"Azul", "Amarelo", "Verde"};
		
		int resp = JOptionPane.showOptionDialog(
				null, "Qual a melhor cor?",
				"Pergunta",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				botoes,
				botoes[0]
				);
	}

}
