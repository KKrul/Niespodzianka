package ProgramCreate;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextArea;

//Instrukcje do redagowania lamiglowki

public class Instrukcje extends JPanel{
	public Instrukcje() {
		JTextArea instrukcje = new JTextArea("1. W pole 'wiersz' (po lewej) wpisz numer wiersza.\n\n"
				+ "2. W pole 'kolumna' (posrodku) wpisz numer kolumny.\n\n"
				+ "3. W pole 'znak' (po prawej) wpisz jaki znak chcesz dodac:\n"
				+ "* 'k'  - niespodzianka;\n"
				+ "* '--' - strzalka pozioma;\n"
				+ "* '|'  - strzalka pionowa;\n"
				+ "* '/'  - strzalka na ukos do przodu;\n"
				+ "* '\\'  - strzalka na ukos do tylu;\n"
				+ "* 'p'  - puste pole.\n\n"
				+ "4. Jezeli wypelniles wszystkie pola, kliknij 'Dodaj', \naby dodac odpowiadajacy znak na dane pole na planszy.\n\n"
				+ "5. Jezeli chcesz zaczac gre, kliknij 'Start'.");
		instrukcje.setVisible(true);
		instrukcje.setEditable(false);
		instrukcje.setFont(new Font("TimesRoman", Font.PLAIN, 17));
		add(instrukcje);
	}
}
