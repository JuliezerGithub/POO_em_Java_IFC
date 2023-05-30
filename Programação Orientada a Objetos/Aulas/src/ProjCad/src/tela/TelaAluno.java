package tela;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import banco.Gerenciador;
import model.Aluno;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaAluno {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAluno window = new TelaAluno();
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
	public TelaAluno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		Gerenciador g = new Gerenciador();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Cadastro tela = new Cadastro();
				Rectangle bounds = frame.getBounds();
				tela.show(bounds.x, bounds.y);
				frame.dispose();
				
			}
		});
		btnCadastrar.setBounds(64, 32, 342, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 66, 444, 11);
		frame.getContentPane().add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 78, 444, 263);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table = createTable(g);
		scrollPane.setViewportView(table);
	}
	
	public void show(int x, int y) 
	{
		Rectangle bounds = frame.getBounds();
		frame.setBounds(x,y,bounds.width,bounds.height);
		frame.setVisible(true);
	}
	
	private JTable createTable(Gerenciador g) {
		JTable table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				int linha = table.getSelectedRow();
				int id = (int)table.getModel().getValueAt(linha, 0);
				
				TelaAlt tela = new TelaAlt();
				Rectangle bounds = frame.getBounds();
				tela.show(bounds.x,bounds.y);
				tela.setRegistro(id);
				frame.dispose();
			}
		});
		
		DefaultTableModel m =
				(DefaultTableModel)table.getModel();
		
		m.addColumn("ra");
		m.addColumn("Nome");
		m.addColumn("Curso");
		
		for(Aluno a : g.getAlunos())
		{
			m.addRow(a.toObject());
		}
		
		return table;
	}
}
