package Session2;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initialize variable need to use for size
		int size = 5;

		// initialize number for type casting
		int number = 97;

		// to calculate number of lines using outer looping statement
		for (int i = 0; i < size; i++) {

			// to calculate number of spaces per line using inner looping
			// statement
			for (int j = 0; j < size; j++) {

				// check the conditions using if else...if decision making
				// statement

				if (i == 2 && j == 2) {
					System.out.print((char) (number + 2));// print character 'c'
				}

				else if (i == 1 && j == 2 || i == 2 && j == 1 || i == 3 && j == 2 || i == 2 && j == 3) {
					System.out.print((char) (number + 1));// print character 'b'
				}

				else if (i + j == 2 || i == 1 && j == 3 || i == 3 && j == 1 || i + j == 6) {
					System.out.print((char) number);// print character 'a'
				}

				else {
					System.out.print(" ");// print white space
				}

			}

			System.out.println();// print the new line
		}

	}

}
