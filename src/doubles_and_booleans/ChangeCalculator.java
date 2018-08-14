package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		int Nickels = Integer.parseInt(JOptionPane.showInputDialog("How many nickels do you have?"));
		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer
		int Dimes = Integer.parseInt(JOptionPane.showInputDialog("How many dimes do you have?"));
		// Ask the user how many quarters they have, and convert their answer
		int Quarters = Integer.parseInt(JOptionPane.showInputDialog("How many quarters do you have?"));
		// Calculate how much money the user has and save it in a double variable 
		
		double Money = 0;
		
		for (int i=0;i<Nickels;i++) {
			Money = Money + 0.05;
		}
		for (int i=0;i<Dimes;i++) {
			Money = Money + 0.1;
		}	
		for (int i=0;i<Quarters;i++) {
			Money = Money + 0.25;
		}
		
		String ExtraText = "";
		
		System.out.println(Money%0.1);
		
		if (Money%0.1==0) {
			ExtraText = "0";
		}
		
		JOptionPane.showMessageDialog(null, "You have $"+Money+ExtraText);
		// Tell the user how much money they have

	}
}

