package Serialization;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Stack;

import javax.swing.JButton;

//Wczytywanie z pliku

public class Load{
	String filename;
	public Load(String filename) {
		this.filename = filename;

		try {
			System.out.println(filename);
			FileInputStream in = new FileInputStream(filename + ".ser");
			ObjectInputStream game = new ObjectInputStream(in);
			int boardSize = (int) game.readObject();
			char model[][] = ((char[][]) game.readObject());
			@SuppressWarnings("unchecked")
			Stack<JButton> history = (Stack<JButton>) game.readObject();
			new NiespodziankiSave(model, boardSize, history);
			game.close();
		} catch (IOException ex) {
			System.out.println("Wyjatek!\n" + ex);
		} catch (ClassNotFoundException ex) {}
	}
}
