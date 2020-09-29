package ProgramChoice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;

//Zmiana koloru pola

public class ChangeColor implements ActionListener{
	Stack<JButton> history;
	public ChangeColor(Stack<JButton> history) {
		this.history = history;
	}

	public void actionPerformed(ActionEvent e) {
		JButton button = ((JButton) e.getSource());
		if(button.getBackground() == Color.red) 
			button.setBackground(Color.white);
		else 
			button.setBackground(Color.red);
		history.push(button);
	}
}