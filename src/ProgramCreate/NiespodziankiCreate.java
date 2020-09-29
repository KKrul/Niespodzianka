package ProgramCreate;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

//Okno planszy do redagowania oraz instrukcji

public class NiespodziankiCreate extends JFrame {
	public NiespodziankiCreate(int boardSize) {
		PlanszaCreate plansza = new PlanszaCreate(boardSize);
		Instrukcje instrukcje = new Instrukcje();
		JButton exit = new JButton("Zamknij okno");
		Container cp = getContentPane();
		exit.addActionListener(new Exit());
		setTitle("Rozstawienie niespodzianek");
		setSize(1500,700);
		cp.setLayout(new GridLayout(1,2));
		instrukcje.setLayout(new GridLayout(2,1));
		instrukcje.add(exit);
		cp.add(plansza);
		cp.add(instrukcje);
	}
	
	class Exit implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}

}
