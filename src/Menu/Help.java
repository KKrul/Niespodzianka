package Menu;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//Drobna instrukcja do łamigłówki

public class Help implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		HelpMenu help = new HelpMenu();
		help.setVisible(true);
		help.setLocationRelativeTo(null);
		help.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}

class HelpMenu extends JFrame{
	public HelpMenu() {
		setTitle("Pomoc");
		setSize(600,100);
		HelpPanel helppanel = new HelpPanel();
		Container cp = getContentPane();
		cp.add(helppanel);
	}
}

class HelpPanel extends JPanel{
	public HelpPanel() {
		JTextArea helpmenu = new JTextArea("1. Na jednym polu jest tylko jedna kropka\n"
				+ "2. Kazda strzalka wskazuje na przynajmniej jedna kropke\n"
				+ "3. Liczby na boku diagramu wskazuja ile kropek jest w danym rzedzie/kolumnie\n");
		helpmenu.setEditable(false);
		add(helpmenu);
		
	}
}
