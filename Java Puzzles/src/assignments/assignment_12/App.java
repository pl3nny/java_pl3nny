package assignments.assignment_12;

import assignments.ignore.TestingUtils12;

public class App {

	/**
	 * 
	 * Return a version of the given string, where for every star (*) in the string
	 * the star and the chars immediately to its left and right are gone. So "ab*cd"
	 * yields "ad" and "ab**cd" also yields "ad". <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * starKill("cd*zq") <b>---></b>"cq"<br>
	 * starKill("ab**cd") <b>---></b> "ad" <br>
	 * starKill("wacy*xko") <b>---></b> "wacko" <br>
	 */

	public static String starKill(String str) {

		String temp = "";

		for (int i = 0; i < str.length(); i++) {
			

			temp += str.charAt(i);
		}

		str = temp;

		return str;
	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils12.runTests();

	}
}
