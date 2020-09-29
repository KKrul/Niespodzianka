package ProgramCreate;

import javax.swing.*;

//Komunikat zlego pola

public class WarningPole extends JFrame{
	public WarningPole() {
	JTextField warning = new JTextField("Nie wychodz poza pole planszy!");
	add(warning);
	setLocationRelativeTo(null);
	setVisible(true);
	setLocationRelativeTo(null);
	setSize(200, 100);
	setDefaultCloseOperation(HIDE_ON_CLOSE);
	setEnabled(false);
	}
}