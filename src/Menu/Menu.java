package Menu;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Menu.Help;

//Panel menu do planszy

public class Menu extends JPanel{

	public Menu() {
		setLayout(new GridLayout(3,1));
		JTextField info = new JTextField("Znajdz wszystkie kropki. Powodzenia!");
		JButton help = new JButton("Pomoc");
		JButton exit = new JButton("Wyjdz");
		exit.addActionListener(new Exit());
		help.addActionListener(new Help());
		info.setFont(new Font("TimesRoman", Font.CENTER_BASELINE, 20));
		info.setEditable(false);
		add(info);
		add(help);
		add(exit);
	}
}


class Exit implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}


