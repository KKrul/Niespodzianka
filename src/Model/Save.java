package Model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;

import Serialization.File;

//Koncowe modyfikacje modelu przed zapisem

public class Save implements ActionListener {
	int boardSize;
	char model[][];
	JButton tab[][];
	Stack<JButton> history;
	
	public Save(JButton tab[][], char model[][], int boardSize, Stack<JButton> history) {
		this.boardSize = boardSize;
		this.model = model;
		this.tab = tab;
		this.history = history;
	}
	
	public void actionPerformed(ActionEvent e) {
		for(int i=1; i<boardSize; i++)
			for(int j=1; j<boardSize; j++) {
				if(tab[i][j].getBackground() == Color.red && model[i][j] == 'k')
					model[i][j] = 'z';
				else if(tab[i][j].getBackground() == Color.red)
					model[i][j] = 'f';
			}
		
		new File(model, boardSize, history);
	}
}