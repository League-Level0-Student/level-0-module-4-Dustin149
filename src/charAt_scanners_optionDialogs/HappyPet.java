package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	double HappinessLevel = 0;
	double MaxHappinessLevel = 10;
	String LastTask = "";
	double Multiplier = 1;
	
	
	public static void main(String[] args) {
		
		boolean Happy = false;
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String DesiredPet = JOptionPane.showInputDialog("What kind of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		while (Happy == false) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Pet", "Feed", "Clean","Cuddle"}, null);

			// 5. Use user input to call the appropriate method created in step 4.
			
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	public void HandleTask(String Task) {
		double IncreasedHappiness = 0;
		
		if (Task == LastTask) {
			Multiplier = Multiplier - 0.05;
			
			if (Task.equalsIgnoreCase("pet")) {
				JOptionPane.showMessageDialog(null, "Your pet is getting bored of your petting.");
			} else if(Task.equalsIgnoreCase("feed")) {
				JOptionPane.showMessageDialog(null, "Your pet is not hungry anymore.");
			} else if(Task.equalsIgnoreCase("clean")) {
				JOptionPane.showMessageDialog(null, "Your pet is already very clean.");
			} else if(Task.equalsIgnoreCase("cuddle")) {
				JOptionPane.showMessageDialog(null, "Your pet doesn't feel like cuddling anymore.");
			}
		}
		
		LastTask = Task;
		
		if (Task.equalsIgnoreCase("pet")) {
			IncreasedHappiness = 0.5*Multiplier;
		} else if(Task.equalsIgnoreCase("feed")) {
			IncreasedHappiness = 0.75*Multiplier;
		} else if(Task.equalsIgnoreCase("clean")) {
			IncreasedHappiness = 1.5*Multiplier;
		} else if(Task.equalsIgnoreCase("cuddle")) {
			IncreasedHappiness = 2*Multiplier;
		}
		
		HappinessLevel = HappinessLevel + IncreasedHappiness;
		JOptionPane.showMessageDialog(null, "Your pet's happiness is now "+HappinessLevel+"! [Increased by "+IncreasedHappiness+"]");
	}
}



