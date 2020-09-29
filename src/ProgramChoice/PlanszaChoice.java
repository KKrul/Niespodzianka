package ProgramChoice;

import javax.swing.*;

import Model.Check;
import Model.Save;
import ProgramCreate.CreateCreate;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

//Tworzenie planszy, po zredagowaniu jej przez uzytkownika

public class PlanszaChoice extends JPanel{
	int i, j, counterDot, counterCheck, dots;
	public PlanszaChoice(JButton tabi[][], char model[][], int boardSize) {
		Stack<JButton> history = new Stack<JButton>();
		JButton tab[][] = new JButton[boardSize][boardSize];
		JButton save = new JButton("Zapisz");
		JButton cofnij = new JButton("Cofnij");
		save.addActionListener(new Save(tab,model,boardSize, history));
		cofnij.addActionListener(new Cofnij(history));
		setLayout(new GridLayout(boardSize+1,boardSize));
		
		for(i=0;i<boardSize;i++)
			for(j=0;j<boardSize;j++) {
				tab[i][j] = new JButton("");
				new CreateChoice(tab,model,boardSize,i,j);
				add(tab[i][j]);
			}
						
		for(i=1; i<boardSize; i++) 
			for(j=1; j<boardSize; j++)
			{
				if(tab[i][j].getBackground() == Color.red)
					tab[i][j].setBackground(Color.lightGray);
				tab[i][j].addActionListener(new ChangeColor(history));
				tab[i][j].addActionListener(new Check(tab, model, boardSize,i,j,0));
			}

		add(save);
		add(cofnij);
		new countDotsinRows(model, tab, boardSize); 
		new countDotsinColumns(model, tab, boardSize); 	
	}
}
