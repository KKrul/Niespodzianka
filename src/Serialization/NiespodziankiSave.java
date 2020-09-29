package Serialization;

import java.awt.Container;
import java.awt.GridLayout;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;

import Menu.Menu;

//Okno planszy wczytywanej z pliku oraz menu

public class NiespodziankiSave extends JFrame{
	public NiespodziankiSave(char model[][], int boardSize, Stack<JButton> history) {
		PlanszaSave plansza = new PlanszaSave(model,boardSize, history);
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