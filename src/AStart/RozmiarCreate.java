package AStart;

import javax.swing.*;

import ProgramCreate.NiespodziankiCreate;

import java.awt.*;
import java.awt.event.*;

//Podanie rozmiaru planszy

public class RozmiarCreate extends JFrame{
	JButton ok = new JButton("OK");
	JTextField size = new JTextField(10);
	
	public RozmiarCreate() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(2,1));
		cp.add(size);
		cp.add(ok);
		size.setFont(new Font("TimesRoman", Font.BOLD, 25));
		ok.addActionListener(new SizeChoice());
		
		setVisible(true);
		setSize(400, 200);
		setTitle("Podaj rozmiar planszy (min 4)");
		setLocationRelativeTo(null);
	}
	
	class SizeChoice implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			try {
				int boardSize = Integer.parseInt(size.getText());
				if(boardSize > 3) {
					JFrame plansza = new NiespodziankiCreate(boardSize + 1);
					plansza.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					plansza.setVisible(true);
					plansza.setLocationRelativeTo(null);
				}
				else System.out.println("Za mala liczba");
			} catch(NumberFormatException ex) {System.out.println("To nie liczba!\n" + ex);}
			
		}
	}
}
