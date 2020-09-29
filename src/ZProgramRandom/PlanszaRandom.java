package ZProgramRandom;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.io.*;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JPanel;

import ProgramChoice.ChangeColor;
import ProgramChoice.Win;
import Serialization.Saved;
import Serialization.File;




public class PlanszaRandom extends JPanel implements Serializable{
	int counterDot,counterCheck,i,j, dots;
	Stack<JButton> history;
	public PlanszaRandom(int boardSize) {
		
		char model[][] = new char[boardSize][boardSize];
		JButton tab[][] = new JButton[boardSize][boardSize];
		setLayout(new GridLayout(boardSize+1,boardSize));
		
		
		
		for(i=0;i<boardSize;i++)
			for(j=0;j<boardSize;j++) {
			 tab[i][j]=new JButton("");
			 add(tab[i][j]);
			}
		for(i=1; i<boardSize; i++) 
			for(j=1; j<boardSize; j++)
			{
				tab[i][j].setBackground(Color.lightGray);
				tab[i][j].addActionListener(new ChangeColor(history));
				tab[i][j].addActionListener(new Check(i,j, tab, model, boardSize));
			}
		
		JButton save = new JButton("Zapisz");
		save.addActionListener(new Save(tab,model,boardSize));
		add(save);
		
		
		setDots(model, tab, boardSize);  //ustawia kropki na planszy
		countDotsinRows(model, tab, boardSize); //liczy ile kropek jest w rzedach
		countDotsinColumns(model, tab, boardSize); //liczy ile kropek jest w kolumnach
		
		tab[0][0].setText("( ͡° ͜ʖ ͡°)");
		
	}
	
	
	class Save implements ActionListener {
		int boardSize;
		char model[][];
		JButton tab[][];
		
		public Save(JButton tab[][], char model[][], int boardSize) {
			this.boardSize = boardSize;
			this.model = model;
			this.tab = tab;
		}
		
		public void actionPerformed(ActionEvent e) {
			for(int i=1; i<boardSize; i++)
				for(int j=1; j<boardSize; j++) {
					if(tab[i][j].getBackground() == Color.red && model[i][j] == 'k')
						model[i][j] = 'z';
					else if(tab[i][j].getBackground() == Color.red)
						model[i][j] = 'f';
				}
			
			//new File(model, boardSize);
		}
	}
	
	class Check implements ActionListener{
		int i,j, boardSize;
		JButton tab[][] = new JButton[boardSize][boardSize];
		char model[][] = new char[boardSize][boardSize];
		
		Check(int i, int j, JButton tab[][], char model[][], int boardSize) {
			this.i = i;
			this.j = j;
			this.tab = tab;
			this.model = model;
			this.boardSize = boardSize;
		}
		
		public void actionPerformed(ActionEvent e) {
			Color btn = ((JButton) e.getSource()).getBackground();
			
			//ZWIEKSZ oba liczniki, jesli zaznaczenie pola z kropka
			if((btn == Color.white || btn == Color.lightGray) && (model[i][j] == 'k' || model[i][j] == 'z'))
			{
				counterDot++;
				counterCheck++;
				System.out.println(counterDot + " " + counterCheck); //Ulatwienie dla programisty
			}
			
			//ZMNIEJSZ oba liczniki, jesli odznaczenie pola z kropka
			if(btn == Color.red && (model[i][j] == 'k' || model[i][j] == 'z'))
			{
				counterDot--;
				counterCheck--;
				System.out.println(counterDot + " " + counterCheck); //Ulatwienie dla programisty
			}
			
			//ZWIEKSZ ogolny licznik, jesli zaznaczenie pola bez kropki
			if((btn == Color.white || btn == Color.lightGray) && model[i][j] != 'k')
			{
				counterCheck++;
			}
				
			//ZMNIEJSZ ogolny licznik, jesli odznaczenie  pola bez  kropki
			if(btn == Color.red && model[i][j] != 'k')
				counterCheck--;
			
			//Sprawdz czy wygrana
			if(counterCheck == dots && counterDot == dots)
				new Win(tab,boardSize);
			}
	}
	
	private void setDots(char model[][], JButton tab[][], int boardSize) {
		for(i=1; i<boardSize; i++)
		{
			for(j=1; j<boardSize; j++)
				if(new Random().nextInt() % 3 == 0 && tab[i][j].getText() != "--" 
				&& tab[i][j].getText() != "/" && tab[i][j].getText() != "\\"
				&& tab[i][j].getText() != "|")
				{
					model[i][j] = 'k';
					setArrow(model, tab, boardSize, dots); //Ustawia strzalke dla kropki
					dots++;
					if(dots > 15)
						break;
				}
			if(dots > 15)
				break;
		}
	}
	
	private void setArrow(char model[][], JButton tab[][], int boardSize, int dots)
	{
		if(j<boardSize-1 && dots % 2 == 0)
		{
			model[i][j+1] = '-';
			tab[i][j+1].setText("--");
			tab[i][j+1].setBackground(Color.black);
			tab[i][j+1].setEnabled(false);
		}
		else if(i<boardSize-1 && dots % 2 == 0) {
			model[i+1][j-1] = '/';
			tab[i+1][j-1].setText("/");
			tab[i+1][j-1].setBackground(Color.black);
			tab[i+1][j-1].setEnabled(false);
		}
		else if(i<boardSize-1 && dots % 2 == 1) {
			model[i+1][j] = '|';
			tab[i+1][j].setText("|");
			tab[i+1][j].setBackground(Color.black);
			tab[i+1][j].setEnabled(false);
		}
		else if(i<boardSize-1 && j<boardSize-1 && dots % 2 == 1) {
			model[i+1][j+1] = '\\';
			tab[i+1][j+1].setText("\\");
			tab[i+1][j+1].setBackground(Color.black);
			tab[i+1][j+1].setEnabled(false);
		}
	}
	
	private void countDotsinRows(char model[][], JButton tab[][], int boardSize) {
		for(i=1; i<boardSize; i++)
		{
			int counter = 0;
			for(j=1; j<boardSize; j++)
				if(model[i][j] == 'k')
					counter++;
			String count = Integer.toString(counter);
			tab[i][0].setText(count);
		}			
	}
	
	private void countDotsinColumns(char model[][], JButton tab[][], int boardSize) {
		for(j=1; j<boardSize; j++)
		{
			int counter = 0;
			for(i=1; i<boardSize; i++)
				if(model[i][j] == 'k')
					counter++;
			String count = Integer.toString(counter);
			tab[0][j].setText(count);
		}	
	}
}





