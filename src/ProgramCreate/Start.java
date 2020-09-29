package ProgramCreate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import ProgramChoice.NiespodziankiChoice;

//Przycisk rozpoczecia rozwiazywania lamiglowki

public class Start implements ActionListener {
	int boardSize;
	JButton tab[][] = new JButton[boardSize][boardSize];
	char model[][] = new char[boardSize][boardSize];
	
	public Start(JButton tab[][], char model[][], int boardSize) {
		this.tab = tab;
		this.model = model;
		this.boardSize = boardSize;
	}
	public void actionPerformed(ActionEvent e) {
		new NiespodziankiChoice(tab,model,boardSize);
		}
}