package assignments.assignment_10;

import assignments.ignore.TestingUtils10;

public class App {

	/**
	 * 
	 * Given 3 int arguments, a b c, return their sum. However, if one of the
	 * arguments is 13 then it does not count towards the sum and arguments to it's
	 * right do not count either. So for example, if b is 13, then both b and c do
	 * not count. <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * partialSum(1, 2, 3) <b>---></b> 6 <br>
	 * partialSum(1, 2, 13) <b>---></b> 3 <br>
	 * partialSum(1, 13, 3) <b>---></b> 1 <br>
	 */

	public static int partialSum(int a, int b, int c) {

		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 13) {
				break;
			}
			sum += arr[i];
		}

		return sum;
	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils10.runTests();
	}
}
