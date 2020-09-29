package AStart;

import java.awt.*;
import javax.swing.*;

import Serialization.File;
import ZProgramRandom.RozmiarRandom;

import java.awt.event.*;

//Poczatek programu, uruchamia menu

public class Wybor extends JFrame{
	JButton random = new JButton("Losowa gra");
	JButton user = new JButton("Tworzenie gry");
	JButton load = new JButton("Wczytaj");
	
	
	public Wybor() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(3,1));
		cp.add(random);
		cp.add(user);
		cp.add(load);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		random.addActionListener(new Random());
		//random.setEnabled(false);
		user.addActionListener(new Choice());
		load.addActionListener(new FileName());
		}
	
	class Random implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			new RozmiarRandom();
		}
	}
	
	class Choice implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			new RozmiarCreate();
		}
	}
	
	class FileName implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			new File();
		}
	}
	
	public static void main(String[] args) {
		JFrame choiceframe = new Wybor();
		choiceframe.setVisible(true);
		choiceframe.setSize(600, 300);
		choiceframe.setTitle("Wybierz rodzaj gry");
		choiceframe.setLocationRelativeTo(null);
		choiceframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
