package tela;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import banco.Gerenciador;
import model.Aluno;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Cadastro {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtRA;
	private JTextField txtCurso;
	Aluno novoAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
				
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 416, 212);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAluno = new JLabel("Nome do Aluno:");
		lblAluno.setBounds(10, 11, 131, 14);
		frame.getContentPane().add(lblAluno);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 28, 380, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtRA = new JTextField();
		txtRA.setColumns(10);
		txtRA.setBounds(10, 76, 86, 20);
		frame.getContentPane().add(txtRA);
		
		JLabel lblRA = new JLabel("RA:");
		lblRA.setBounds(10, 59, 86, 14);
		frame.getContentPane().add(lblRA);
		
		txtCurso = new JTextField();
		txtCurso.setColumns(10);
		txtCurso.setBounds(106, 76, 284, 20);
		frame.getContentPane().add(txtCurso);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(106, 59, 131, 14);
		frame.getContentPane().add(lblCurso);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				TelaAluno tela =  new TelaAluno();
				Rectangle bounds = frame.getBounds();
				tela.show(bounds.x, bounds.y);
				frame.dispose();
				
			}
		});
		btnCancelar.setBounds(10, 107, 182, 42);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnCadastrar = new JButton("Casdastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtNome.getText().equals("")) 
				{
					JOptionPane.showMessageDialog(null, "Obrigatório Nome!");
				}else if(txtRA.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Obrigatório Registro Acadêmico!");
				}
				else if(txtCurso.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Obrigatório Curso!");
				}else 
				{
					JOptionPane.showMessageDialog(null, "Cadastro Efetuado!");
					novoAluno = new Aluno(Integer.parseInt(txtRA.getText()),txtNome.getText(), txtCurso.getText());
				}
				//Inserir o Aluno no TXT
				Gerenciador g = new Gerenciador();
				
				if(!g.insere(novoAluno)) 
				{
					JOptionPane.showMessageDialog(null, "Cadastro não efetuado");
				}
				
				TelaAluno tela =  new TelaAluno();
				Rectangle bounds = frame.getBounds();
				tela.show(bounds.x, bounds.y);
				frame.dispose();//fechar a janela
				
			}
		});
		btnCadastrar.setBounds(208, 107, 182, 42);
		frame.getContentPane().add(btnCadastrar);
	}
	
	public void show(int x, int y) 
	{
		Rectangle bounds = frame.getBounds();
		frame.setBounds(x,y,bounds.width,bounds.height);
		frame.setVisible(true);
		
	}
}
