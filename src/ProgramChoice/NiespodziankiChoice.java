package ProgramChoice;

import javax.swing.*;
import java.awt.*;
import Menu.Menu;

//Okno planszy po zredagowaniu przez uzytkownika oraz menu

public class NiespodziankiChoice extends JFrame{
	public NiespodziankiChoice(JButton tab[][], char model[][], int boardSize) {
		PlanszaChoice plansza = new PlanszaChoice(tab,model,boardSize);
		Menu menu = new Menu();
		Container cp = getContentPane();
		setTitle("Niespodzianki");
		setSize(1400,700);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		
		cp.setLayout(new GridLayout(1,2));
		cp.add(plansza);
		cp.add(menu);
	}

}
