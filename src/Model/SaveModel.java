package Model;


import javax.swing.JButton;

import Serialization.CreateSave;

//Model planszy wczytywanej z pliku

public class SaveModel{
	public SaveModel(JButton tab[][], char model[][], int boardSize, int i, int j) {
		
			
				if(model[i][j] == '|') 
					new CreateSave(tab[i][j], '|');
				
				else if(model[i][j] == '\\') 
					new CreateSave(tab[i][j], '\\');
				
				else if(model[i][j] == '/') 
					new CreateSave(tab[i][j], '/');
				
				else if(model[i][j] == '-') 
					new CreateSave(tab[i][j], '-');
				
				else if(model[i][j] == 'z') 
					new CreateSave(tab[i][j], 'z');
				
				else if(model[i][j] == 'f') 
					new CreateSave(tab[i][j], 'f');
				
				else if(i != 0 && j!= 0) 
					new CreateSave(tab[i][j], 'g');
			}
	
	public SaveModel() {}
	public int countDot(char model[][], int boardSize) {
		int counterDot=0;
		for(int i=1; i<boardSize; i++) 
			for(int j=1; j<boardSize; j++)
				if(model[i][j] == 'z')
					counterDot++;
		return counterDot;
					
	}
}

