package stopwatch;

import javax.swing.JOptionPane;

public class StartHere {
	
	/*
	 * 
	 * GRADING:
	 * 1. Finish with all 7 names for a cross country team
	 * 2. Change "elapsed time seconds" to 
	 * "elapsed time:" minutes:seconds.xx
	 * 
	 */

	public static void main(String[] args) {
		
		int createOption = 1; // 0 = yes, 1 = no from showConfirmDialog
		String watchName;

		createOption = JOptionPane.showConfirmDialog(null,
				"Would you like to create a stopwatch?",
				"Stopwatch Creation by MrM",
				JOptionPane.YES_NO_OPTION);
		
		//System.out.println("JOP returned: " + createOption);
		
		if (createOption == 0) {

			watchName = JOptionPane.showInputDialog(null,
					"Enter a name for your stopwatch");
			Stopwatch watch = new Stopwatch(watchName);
			watch.setLocationByPlatform(true);
			watch.setVisible(true);
		}
		do {
			createOption = JOptionPane.showConfirmDialog(null,
					"Would you like to create ANOTHER stopwatch?", "Stopwatch Creation",
					JOptionPane.YES_NO_OPTION);
			
			if (createOption == 0) {

				watchName = JOptionPane.showInputDialog(null,
						"Enter a name for your ADDITIONAL stopwatch");
				Stopwatch watch = new Stopwatch(watchName);
				watch.setLocationByPlatform(true);
				watch.setVisible(true);
			}
			
		} while (createOption == 0);

	}
} //end of class

