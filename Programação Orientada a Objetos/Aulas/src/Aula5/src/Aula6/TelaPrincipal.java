package Aula6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal {

	private JFrame frame;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtResposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);//Método Estatico do JFrame, que mostra uma tela quando está como TRUE
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 201, 191);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblnum1 = new JLabel("Número 1:");
		lblnum1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblnum1.setBounds(10, 11, 151, 21);
		frame.getContentPane().add(lblnum1);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(92, 11, 86, 20);
		frame.getContentPane().add(txtNum1);
		txtNum1.setColumns(10);
		
		JLabel lblnum2 = new JLabel("Número 2:");
		lblnum2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblnum2.setBounds(10, 43, 151, 21);
		frame.getContentPane().add(lblnum2);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(92, 43, 86, 20);
		frame.getContentPane().add(txtNum2);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Fazendo um cast:
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				
				int soma = num1 + num2;
				txtResposta.setText(""+soma);
			}
		});
		btnCalcular.setBounds(46, 86, 89, 23);
		frame.getContentPane().add(btnCalcular);
		
		JLabel lblresposta = new JLabel("Resposta:");
		lblresposta.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblresposta.setBounds(10, 120, 151, 21);
		frame.getContentPane().add(lblresposta);
		
		txtResposta = new JTextField();
		txtResposta.setColumns(10);
		txtResposta.setBounds(92, 120, 86, 20);
		frame.getContentPane().add(txtResposta);
	}
}
