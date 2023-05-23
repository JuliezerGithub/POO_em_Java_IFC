package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(64, 32, 89, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(306, 32, 89, 23);
		frame.getContentPane().add(btnAlterar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 66, 444, 11);
		frame.getContentPane().add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 78, 444, 263);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table = createTable();
		scrollPane.setViewportView(table);
	}
	private JTable createTable() {
		JTable table = new JTable();
		
		DefaultTableModel m =
				(DefaultTableModel)table.getModel();
		m.addColumn("ra");
		m.addColumn("Nome");
		m.addColumn("Curso");
		return table;
	}
}
