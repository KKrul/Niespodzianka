package ProgramCreate;

import javax.swing.*;

import Model.Dodaj;

import java.awt.*;

//Tworzenie planszy do redagowania

public class PlanszaCreate extends JPanel{
	public PlanszaCreate(int boardSize) {
		JButton dodaj = new JButton("Dodaj");
		JButton start = new JButton("Start");
		JTextField row = new JTextField("0");
		JTextField column = new JTextField("0");
		JTextField sign = new JTextField("znak");
		
		char model[][] = new char[boardSize][boardSize];
		JButton tab[][] = new JButton[boardSize][boardSize];
		setLayout(new GridLayout(boardSize+1,boardSize));
		
		for(int i=0;i<boardSize;i++)
			for(int j=0;j<boardSize;j++) {
			 tab[i][j]=new JButton("");
			 add(tab[i][j]);
			}
		
		for(int i=1; i<boardSize; i++) 
			for(int j=1; j<boardSize; j++)
				tab[i][j].setBackground(Color.lightGray);
		
		for(int i = 1; i<boardSize; i++)
			tab[i][0].setText("" + i);
		
		for(int j = 1; j<boardSize; j++)
			tab[0][j].setText("" + j);
		
		tab[0][0].setText("( ͡° ͜ʖ ͡°)");
		
		
		
		dodaj.addActionListener(new Dodaj(tab,model,boardSize,row,column,sign));
		start.addActionListener(new Start(tab,model,boardSize));
		
		
		add(row);
		add(column);
		add(sign);
		add(dodaj);
		add(start);
		
	}
}