package control;

import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ThreadCarro extends Thread {
	
	private JLabel carro;
	private JButton comecar;
	private JTextField txtvencedor;
	private JTextField txtperdedor;
	
	public ThreadCarro(JLabel carro, JButton comecar) {
		
		this.carro = carro;
		this.comecar = comecar;
	}
	
	private void mexeCarro() {
		
		comecar.setEnabled(false);
		Rectangle posicao;
		posicao = carro.getBounds();
		carro.setBounds(posicao);
		int dis = 0;
		int ar;
		while (dis <= 500) {
			ar = (int) (Math.random()*4);
			if (ar == 1) {
				
				if(!((posicao.x + 100) > 500)) {
					
					posicao.x = (int) (posicao.x + (Math.random()*100));
				
				} else {
					
					if(!txtvencedor.getText().equals(" ")) {
						txtperdedor.setText(carro.toString());
					} else {
						txtvencedor.setText(carro.toString());
					}
					posicao.x = 500;
				}
			} else {
				
				posicao.x = posicao.x + 10;
				
			}
			carro.setBounds(posicao);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			dis = posicao.x;
			
		}
		comecar.setEnabled(true);
	}
	@Override
	public void run() {
		mexeCarro();
	}
}