package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog("Brothers and sisters I have none, but this man's father is my father's son. Who is the man?");	
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddle.equals("my son")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score+=1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong. The answer is my son.");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		
		// 6. Add some more riddles
		String riddle2 = JOptionPane.showInputDialog("Who makes it, has no need of it. Who buys it, has no use for it. Who uses it can neither see nor feel it. What is it?");
		if(riddle2.equals("a coffin")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score+=1;
		} else {
			JOptionPane.showMessageDialog(null,"Wrong. The answer is a coffin.");
		}
		
		String riddle3 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		if(riddle3.equals("a stamp")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score+=1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong. The answer is a stamp.");
		}
		
		// 2. Make a pop up to show the score.
		
	}
}

