package ProgramChoice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;

public class Cofnij implements ActionListener {
	Stack<JButton> history;
	public Cofnij (Stack<JButton> history) {
		this.history = history;
	}
	public void actionPerformed(ActionEvent e) {
		if(history.isEmpty()) System.out.println("Nie mozna cofnac");
		else {
			JButton button = history.pop();
			Color color = button.getBackground();
			if(color == Color.red)
				button.setBackground(Color.white);
			else button.setBackground(Color.red);
		}
	}
}