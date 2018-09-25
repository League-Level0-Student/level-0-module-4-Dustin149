package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.

		while (true) {
			// 2. Customize pop-up to support add/subtract/multiply/divide operations.
			int operation = JOptionPane.showOptionDialog(null, "What operation do you want to use?", "Pop-up Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
					null);
			
			int Num1 = Integer.parseInt( JOptionPane.showInputDialog("Input your first number..."));
			int Num2 = Integer.parseInt( JOptionPane.showInputDialog("Input your second number..."));
			
			if (operation == 0) {
				Add(Num1,Num2);
			} else if (operation == 1) {
				Subtract(Num1,Num2);
			} else if (operation == 2) {
				Multiply(Num1,Num2);
			} else if (operation == 3) {
				Divide(Num1,Num2);
			}
			// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
			
			// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
		}
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
		public static double Add(int Num1, int Num2) {
			double Sum = Num1 + Num2;
			JOptionPane.showMessageDialog(null, Num1+" + "+Num2+" = "+Sum);
			return Sum;
		}
	//    HINT: use 'static void add(int num1, num2) { ... }
		public static double Subtract(int Num1, int Num2) {
			double Difference = Num1 - Num2;
			JOptionPane.showMessageDialog(null, Num1+" - "+Num2+" = "+Difference);
			return Difference;
		}
		
		public static double Divide(int Num1, int Num2) {
			double Dividend = Num1 / Num2;
			JOptionPane.showMessageDialog(null, Num1+" / "+Num2+" = "+Dividend);
			return Dividend;
		}
		
		public static double Multiply(int Num1, int
				Num2) {
			double Product = Num1 * Num2;
			JOptionPane.showMessageDialog(null, Num1+" x "+Num2+" = "+Product);
			return Product;
		}
	// 4. Create similar methods for subtraction, multiplication and division.
}