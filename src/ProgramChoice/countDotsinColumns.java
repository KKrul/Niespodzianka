package ProgramChoice;

import javax.swing.JButton;

//Zliczanie niespodzianek w kolumnach

public class countDotsinColumns {
	public countDotsinColumns(char model[][], JButton tab[][], int boardSize) {
		for(int j=1; j<boardSize; j++)
		{
			int counter = 0;
			for(int i=1; i<boardSize; i++)
				if(model[i][j] == 'k')
					counter++;
			String count = Integer.toString(counter);
			tab[0][j].setText(count);
		}	
	}
}
