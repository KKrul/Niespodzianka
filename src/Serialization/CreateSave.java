package Serialization;

import java.awt.Color;

import javax.swing.JButton;

//Tworzenie pola na planszy wczytywanej

public class CreateSave {
	public CreateSave(JButton tab, char znak) {
		if(znak == '|') {
			tab.setText("|");
			tab.setBackground(Color.black);
			tab.setEnabled(false);
		}
		else if(znak == '/') {
			tab.setText("/");
			tab.setBackground(Color.black);
			tab.setEnabled(false);
		}
		else if(znak == '\\') {
			tab.setText("\\");
			tab.setBackground(Color.black);
			tab.setEnabled(false);
		}
		else if(znak == '-') {
			tab.setText("--");
			tab.setBackground(Color.black);
			tab.setEnabled(false);
		}
		else if(znak == 'z' || znak == 'f')
			tab.setBackground(Color.red);
		else if(znak == 'g')
			tab.setBackground(Color.lightGray);
	}
}
