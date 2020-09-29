package ZProgramRandom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Menu.Menu;


public class NiespodziankiRandom extends JFrame {
	
	public NiespodziankiRandom(int boardSize) {
		PlanszaRandom plansza = new PlanszaRandom(boardSize);
		Menu menu = new Menu();
		Container cp = getContentPane();
		setTitle("Niespodzianki");
		setSize(1400,700);
		
		cp.setLayout(new GridLayout(1,2));
		cp.add(plansza);
		cp.add(menu);
	}
}



