package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String jeff = "Jeff is so good at programming.";
		String emily = "Emily is super nice.";
		String bob = "Bob is good at cooking.";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("Enter a name.");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if(name.equals("Jeff")) {
			JOptionPane.showMessageDialog(null, jeff);
		} else if(name.equals("Emily")) {
			JOptionPane.showMessageDialog(null, emily);
		} else if(name.equals("Bob")) {
			JOptionPane.showMessageDialog(null, bob);
		}
	}
}

