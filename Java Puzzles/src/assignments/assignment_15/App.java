package assignments.assignment_15;

import assignments.ignore.TestingUtils15;

public class App {

	/**
	 * 
	 * Given a string, return the length of the longest streak of the same chars in
	 * the string.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * longestStreak("hayyeu") <b>---></b> 2<br>
	 * longestStreak("XPNzzzddOOOxx") <b>---></b> 3 <br>
	 * longestStreak("") <b>---></b> 0 <br>
	 */

	public static int longestStreak(String str) {

		if (str.length() > 0) {

			int count = 1;
			int longest = 0;

			for (int i = 1; i < str.length(); i++) {
				
				if(str.charAt(i - 1) == str.charAt(i)){
					count++;
				}
				else {
					count = 1;
				}

				if(count > longest){
					longest = count;
				}
			}

			return longest;

		}

		return 0;
	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils15.runTests();

	}
}
