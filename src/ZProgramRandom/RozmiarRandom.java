package ZProgramRandom;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RozmiarRandom extends JFrame{
	JButton ok = new JButton("OK");
	JTextField size = new JTextField(10);
	
	public RozmiarRandom() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(2,1));
		cp.add(size);
		cp.add(ok);
		size.setFont(new Font("TimesRoman", Font.BOLD, 25));
		ok.addActionListener(new SizeRandom());
		
		setVisible(true);
		setSize(400, 200);
		setTitle("Podaj rozmiar planszy (min 4)");
		setLocationRelativeTo(null);
	}
	
	class SizeRandom implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			int boardSize = Integer.parseInt(size.getText());
			JFrame plansza = new NiespodziankiRandom(boardSize + 1);
			plansza.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			plansza.setVisible(true);
			plansza.setLocationRelativeTo(null);
		}
	}
	
	
}
