package tela;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import banco.Gerenciador;
import model.Aluno;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaAlt {

	private JFrame frame;
	private JTextField textNome;
	private JTextField textRA;
	private JTextField textCurso;
	
	private int registro;

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;

		textRA.setText(registro+"");
		textRA.setEditable(false);
		
		if(registro!=0) {	
			
			Gerenciador g = new Gerenciador();
			Aluno aluno = g.getAlunobyRA(registro);
			textNome.setText(aluno.getNome());
			textCurso.setText(aluno.getCurso());
		}
			
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlt window = new TelaAlt();
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
	public TelaAlt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Gerenciador g = new Gerenciador();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 222);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAluno = new JLabel("Aluno:");
		lblAluno.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblAluno);
		
		textNome = new JTextField();
		textNome.setBounds(10, 25, 414, 20);
		frame.getContentPane().add(textNome);
		textNome.setColumns(10);
		
		JLabel lblRA = new JLabel("RA:");
		lblRA.setBounds(10, 56, 84, 14);
		frame.getContentPane().add(lblRA);
		
		textRA = new JTextField();
		textRA.setColumns(10);
		textRA.setBounds(10, 70, 84, 20);
		frame.getContentPane().add(textRA);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(115, 56, 84, 14);
		frame.getContentPane().add(lblCurso);
		
		textCurso = new JTextField();
		textCurso.setColumns(10);
		textCurso.setBounds(115, 70, 309, 20);
		frame.getContentPane().add(textCurso);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ra = Integer.parseInt(textRA.getText());
				g.remove(ra);
				TelaAluno tela = new TelaAluno();
				Rectangle bounds = frame.getBounds();
				tela.show(bounds.x, bounds.y);
				frame.dispose();				
			}
		});
		btnRemover.setBounds(49, 117, 89, 35);
		frame.getContentPane().add(btnRemover);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int ra = Integer.parseInt(textRA.getText());
				Aluno novoAluno = new Aluno(ra,textNome.getText(), textCurso.getText());
				
			g.remove(ra);
			g.insere(novoAluno);
			
			TelaAluno tela = new TelaAluno();
			Rectangle bounds = frame.getBounds();
			tela.show(bounds.x, bounds.y);
			frame.dispose();
			
			}
		});
		btnAlterar.setBounds(169, 117, 89, 35);
		frame.getContentPane().add(btnAlterar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				TelaAluno tela = new TelaAluno();
				Rectangle bounds = frame.getBounds();
				tela.show(bounds.x, bounds.y);
				frame.dispose();
				
			}
		});
		btnVoltar.setBounds(289, 117, 89, 35);
		frame.getContentPane().add(btnVoltar);
	}
	public void show(int x, int y) 
	{
		Rectangle bounds = frame.getBounds();
		frame.setBounds(x,y,bounds.width,bounds.height);
		frame.setVisible(true);
	}
}
