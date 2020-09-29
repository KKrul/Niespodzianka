package ProgramChoice;

import javax.swing.*;
import java.util.Random;
import AStart.Wybor;

import java.awt.*;
import java.awt.event.*;

//Koncowe okienko z mozliwoscia ponownego uruchomienia programu

public class Win extends JFrame{
	JButton win = new JButton("Wygrales!!!");
	JButton again = new JButton("Zacznij od poczatku");
	public Win(JButton tab[][], int boardSize) {
		for(int i=1; i<boardSize; i++) 
			for(int j=1; j<boardSize; j++)
				tab[i][j].setEnabled(false);
		
		setLayout(new GridLayout(2,1));
		again.addActionListener(new Again());
		win.addActionListener(new Winlol());
		add(win);
		add(again);
		setLocationRelativeTo(null);
		setVisible(true);
		setSize(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	class Again implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			JFrame choiceframe = new Wybor();
			choiceframe.setVisible(true);
			choiceframe.setSize(600, 300);
			choiceframe.setTitle("Wybierz rodzaj gry");
			choiceframe.setLocationRelativeTo(null);
		}
	}
	
	class Winlol implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Random rand = new Random();
			float r = rand.nextFloat();
			float g = rand.nextFloat();
			float b = rand.nextFloat();
			Color randomColor = new Color(r,g,b);
			win.setBackground(randomColor);
			
		}
	}
}
