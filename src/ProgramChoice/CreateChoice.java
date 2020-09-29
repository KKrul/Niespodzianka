package ProgramChoice;

import java.awt.Color;

import javax.swing.JButton;

//Tworzy pola do zredagowanej planszy

public class CreateChoice {
    public CreateChoice(JButton tab[][], char model[][], int boardSize, int i, int j) {
      if(i!=0 && j!=0)
        if(model[i][j] == '-')
        {
            tab[i][j].setText("--");
            tab[i][j].setBackground(Color.black);
			tab[i][j].setEnabled(false);
        }

        else if(model[i][j] == '|')
        {
            tab[i][j].setText("|");
            tab[i][j].setBackground(Color.black);
			tab[i][j].setEnabled(false);
        }

        else if(model[i][j] == '\\')
        {
            tab[i][j].setText("\\");
            tab[i][j].setBackground(Color.black);
			tab[i][j].setEnabled(false);
        }

        else if(model[i][j] == '/')
        {
            tab[i][j].setText("/");
            tab[i][j].setBackground(Color.black);
			tab[i][j].setEnabled(false);
        }
        else tab[i][j].setBackground(Color.lightGray);
      
      if(i==0 && j==0)
    	  tab[i][j].setText("( ͡° ͜ʖ ͡°)");
    }
}
