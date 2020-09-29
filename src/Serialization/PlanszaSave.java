package Serialization;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JPanel;

import Model.Check;
import Model.Save;
import Model.SaveModel;
import ProgramChoice.ChangeColor;
import ProgramChoice.Cofnij;
import ProgramChoice.countDotsinColumns;
import ProgramChoice.countDotsinRows;

//Tworzenie planszy po wczytaniu z pliku

public class PlanszaSave extends JPanel{
	int i, j, counterDot;
	public PlanszaSave(char model[][], int boardSize, Stack<JButton> history) {
		JButton save = new JButton("Zapisz");
		JButton cofnij = new JButton("Cofnij");
		JButton tab[][] = new JButton[boardSize][boardSize];
		save.addActionListener(new Save(tab,model,boardSize, history));
		cofnij.addActionListener(new Cofnij(history));
		setLayout(new GridLayout(boardSize+1,boardSize));
	
		
		for(i=0;i<boardSize;i++)
			for(j=0;j<boardSize;j++) {
			 tab[i][j]=new JButton("");
			}
		
		SaveModel A = new SaveModel();
		counterDot = A.countDot(model, boardSize);
		
		for(i=0; i<boardSize; i++) 
			for(j=0; j<boardSize; j++) {
				new SaveModel(tab,model,boardSize,i,j);
				tab[i][j].addActionListener(new ChangeColor(history));
				tab[i][j].addActionListener(new Check(tab, model, boardSize, i, j, counterDot));
				add(tab[i][j]);
			}
		
		add(save);
		add(cofnij);
		tab[0][0].setText("( ͡° ͜ʖ ͡°)");
		
		new countDotsinRows(model, tab, boardSize); //liczy ile kropek jest w rzedach
		new countDotsinColumns(model, tab, boardSize); //liczy ile kropek jest w kolumnach
		
	}
}

