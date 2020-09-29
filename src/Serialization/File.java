package Serialization;

import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

import javax.swing.*;

//Okno zapisywania i wczytywania

public class File extends JFrame {

	public File() {
		JTextField name = new JTextField(10);
		JButton ok = new JButton("OK");
		String nam = "save.ser";
		ok.addActionListener(new OKLoad(name));

		setLayout(new GridLayout(2, 1));
		setTitle("Podaj nazwe pliku");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

		add(name);
		add(ok);
	}
	
	class OKLoad implements ActionListener {
		JTextField name;

		OKLoad(JTextField name) {
			this.name = name;
		}
		public void actionPerformed(ActionEvent e) {
			dispose();
			String filename = name.getText();
			new Load(filename);
		}
	}
	

	public File(char model[][], int boardSize, Stack<JButton> history) {
		JTextField name = new JTextField(10);
		JButton ok = new JButton("OK");
		ok.addActionListener(new OKSave(name, model, boardSize, history));

		setLayout(new GridLayout(2, 1));
		setTitle("Podaj nazwe pliku");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

		add(name);
		add(ok);
	}

	class OKSave implements ActionListener {
		JTextField name;
		int boardSize;
		char model[][];
		Stack<JButton> history;

		OKSave(JTextField name, char model[][], int boardSize, Stack<JButton> history) {
			this.name = name;
			this.model = model;
			this.boardSize = boardSize;
			this.history = history;
		}
		public void actionPerformed(ActionEvent e) {
			dispose();
			String filename = name.getText();
			new Saved(filename,model, boardSize, history);
		}
	}
}

