package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class CorridaController implements ActionListener{
	
	private JLabel carro1;
	private JLabel carro2;
	private JButton comecar;
	
	public CorridaController(JLabel carro1, 
		JLabel carro2, JButton comecar) {
		
		this.carro1 = carro1;
		this.carro2 = carro2;
		this.comecar = comecar;
		
	}
	
	@SuppressWarnings("deprecation")
	private void corrida(){
		
		Thread t1 = new ThreadCarro(carro1, comecar);
		Thread t2 = new ThreadCarro(carro2, comecar);
		comecar.hide();
		t1.start();
		t2.start();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		corrida();
	}
}