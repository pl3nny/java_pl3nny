package assignments.assignment_11;

import assignments.ignore.TestingUtils11;

public class App {

	/**
	 * 
	 * Given a string, return a string where for every char in the original, append
	 * another. <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * repeatChar("The") <b>---></b>"TThhee"<br>
	 * repeatChar("AAbb") <b>---></b> "AAAAbbbb" <br>
	 * repeatChar("Hi-There") <b>---></b> "HHii--TThheerree" <br>
	 */

	public static String repeatChar(String str) {

		String tempString = "";

		for (int i = 0; i < str.length(); i++) {
			tempString += str.charAt(i);
			tempString += str.charAt(i);
		}

		str = tempString;

		return str;
	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils11.runTests();
	}
}
