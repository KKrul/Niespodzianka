package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Stack;

import javax.swing.JButton;

//Zapisywanie do pliku

public class Saved{
	public Saved(String filename, char model[][], int boardSize, Stack<JButton> history) {
		try {
			FileOutputStream out = new FileOutputStream(filename + ".ser");
			ObjectOutputStream game = new ObjectOutputStream(out);
			game.writeObject(boardSize);
			game.writeObject(model);
			game.writeObject(history);
			game.close();
		} catch(IOException ex) {}
	}
}