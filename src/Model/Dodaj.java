package Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import ProgramCreate.CreateCreate;
import ProgramCreate.WarningPole;
import ProgramCreate.WarningSign;

//Dodawanie do modelu nowych elementow

public class Dodaj implements ActionListener {
	int boardSize;
	JTextField row,column,sign;
	JButton tab[][];
	char model[][];
	public Dodaj(JButton tab[][], char model[][], int boardSize, JTextField row, JTextField column, JTextField sign) {
		this.tab = tab;
		this.model = model;
		this.boardSize = boardSize;
		this.row = row;
		this.column = column;
		this.sign = sign;
	}
	public void actionPerformed(ActionEvent e) {
		int i = Integer.parseInt(row.getText());
		int j = Integer.parseInt(column.getText());
		String znak = sign.getText();
		if (i < 1 || i > boardSize || j < 1 || j > boardSize)
			new WarningPole();

		else if(znak.contentEquals("p"))
			model[i][j] = 'p';
		else if (znak.contentEquals("k"))
			model[i][j] = 'k';

		else if (znak.contentEquals("--"))
			model[i][j] = '-';

		else if (znak.contentEquals("|"))
			model[i][j] = '|';

		else if (znak.contentEquals("\\"))
			model[i][j] = '\\';

		else if (znak.contentEquals("/"))
			model[i][j] = '/';

		else new WarningSign();
		new CreateCreate(tab,model,boardSize,i,j);
	}
}
