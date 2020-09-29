package ProgramChoice;

import javax.swing.JButton;

//Zliczanie niespodzianek w rzedach

public class countDotsinRows {
	public countDotsinRows(char model[][], JButton tab[][], int boardSize) {
		for(int i=1; i<boardSize; i++)
		{
			int counter = 0;
			for(int j=1; j<boardSize; j++)
				if(model[i][j] == 'k')
					counter++;
		
			String count = Integer.toString(counter);
			tab[i][0].setText(count);
		}			
	}
}
