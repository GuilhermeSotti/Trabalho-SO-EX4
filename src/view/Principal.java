package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.CorridaController;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSeparator;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTextField txtvencedor;
	private JTextField txtperdedor;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton comecar = new JButton("Correr");
		comecar.setBounds(25, 168, 89, 23);
		contentPane.add(comecar);
		
		txtvencedor = new JTextField();
		txtvencedor.setText(" ");
		txtvencedor.setBounds(280, 158, 86, 20);
		contentPane.add(txtvencedor);
		txtvencedor.setColumns(10);
		
		JLabel vencedor = new JLabel("Vencedor");
		vencedor.setBounds(203, 159, 67, 18);
		contentPane.add(vencedor);
		
		JLabel perdedor = new JLabel("Perdedor");
		perdedor.setBounds(203, 190, 67, 18);
		contentPane.add(perdedor);
		
		txtperdedor = new JTextField();
		txtperdedor.setText(" ");
		txtperdedor.setBounds(280, 189, 86, 20);
		contentPane.add(txtperdedor);
		txtperdedor.setColumns(10);
		
		JLabel carro1 = new JLabel("Carro1");
		carro1.setForeground(Color.BLUE);
		carro1.setBounds(25, 22, 89, 20);
		contentPane.add(carro1);
		
		JLabel carro2 = new JLabel("Carro2");
		carro2.setForeground(Color.RED);
		carro2.setBounds(25, 61, 89, 20);
		contentPane.add(carro2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 53, 549, 2);
		contentPane.add(separator);
		
		CorridaController corridaController = new CorridaController(
				carro1, carro2, comecar);
		comecar.addActionListener(corridaController);
	}
}
