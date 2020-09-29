package ProgramCreate;

import javax.swing.JFrame;
import javax.swing.JTextField;

//Komunikat zlego znaku

public class WarningSign extends JFrame{
	public WarningSign() {
		JTextField warning = new JTextField("Zly znak!");
		add(warning);
		setLocationRelativeTo(null);
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(100, 100);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setEnabled(false);
	}
}
