package Model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import ProgramChoice.Win;

//Sprawdzanie, czy uzytkownik wygral

//counterDot - licznik niespodzianek
//counterCheck - licznik zaznaczonych pol

public class Check implements ActionListener {
	int i,j,a,b, boardSize, counterDot;
	JButton tab[][];
	char model[][];
	
	public Check(JButton tab[][], char model[][], int boardSize, int i, int j, int counterDot) {
		this.tab = tab;
		this.model = model;
		this.boardSize = boardSize;
		this.i = i;
		this.j = j;
		this.counterDot = counterDot;
	}
	
	public void actionPerformed(ActionEvent e) {
		Color btn = ((JButton) e.getSource()).getBackground();
		int dots = countDots();
		int counterCheck = 0;
		for(a=1; a<boardSize-1; a++)
			for(b=1; b<boardSize-1; b++) {
				if(tab[a][b].getBackground() == Color.red && model[a][b] == 'k')
				{
					counterDot++;
					counterCheck++;
				}
				if(tab[a][b].getBackground() == Color.red && model[a][b] != 'k')
					counterCheck++;
			}
		
		//ZWIEKSZ oba liczniki, jesli zaznaczenie pola z kropka
		if((btn == Color.white || btn == Color.lightGray) && model[i][j] == 'k') {
			counterDot++;
			counterCheck++;
		}
		
		//ZMNIEJSZ oba liczniki, jesli odznaczenie pola z kropka
		if(btn == Color.red && model[i][j] == 'k') {
			counterDot--;
			counterCheck--;
		}
		
		//ZWIEKSZ ogolny licznik, jesli zaznaczenie pola bez kropki
		if((btn == Color.white || btn == Color.lightGray) && model[i][j] != 'k')
			counterCheck++;
		
		//ZMNIEJSZ ogolny licznik, jesli odznaczenie  pola bez  kropki
		if(btn == Color.red && model[i][j] != 'k')
			counterCheck--;
		
		//System.out.println(counterDot + " " + counterCheck); //Ulatwienie dla programisty
		
		//Sprawdz czy wygrana
		if(counterCheck == dots && counterDot == dots)
			new Win(tab,boardSize);
	}
	
	//Liczenie niespodzianek na planszy
	private int countDots() {
		int count = 0;
		for(int i=1; i<boardSize; i++)
			for(int j=1; j<boardSize; j++)
				if(model[i][j] == 'k' || model[i][j] == 'z')
					count++;
		return count;
	}
}