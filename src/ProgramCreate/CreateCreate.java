package ProgramCreate;

import javax.swing.*;
import java.awt.*;

//Tworzy pola, podczas redagowania uzytkownika

public class CreateCreate  {
    public CreateCreate(JButton tab[][], char model[][], int boardSize, int i, int j) {
        if (model[i][j] == 'p')
        {
            tab[i][j].setText("");
            tab[i][j].setBackground(Color.lightGray);
        }
        else if(model[i][j] == 'k')
        {
            tab[i][j].setText("");
            tab[i][j].setBackground(Color.red);
        }

        else if(model[i][j] == '-')
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
    }
}
