package week5;

import java.util.Scanner;

public class RomanV1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.print("Insert any number (1-399): ");
		int input = read.nextInt();
		System.out.println("This might take a long time running the program.");
		
		if (input < 400) {
			int[] arraySum = { 0, 0, 0, 0, 0 };
			arraySum = countRomanAll(input, arraySum);

			for (int j = 0; j < arraySum.length; ++j) {
				System.out.print(arraySum[j] + " ");
			}
			
		} else {
			System.out.println("Input has to be between 1 and 399.");
		}
		
		read.close();
	}

	public static int[] countRomanAll(int input, int[] arraySum) {
		if (input == 1) {
			return countRomanEach(input);
		} else {
			arraySum = countRomanAll(input - 1, arraySum);
			int[] arrayInput = countRomanEach(input);
			for (int j = 0; j < arrayInput.length; ++j) {
				arraySum[j] += arrayInput[j];
			}

			return arraySum;
		}
	}

	public static int[] countRomanEach(int input) {
		int[] arrayInput = { 0, 0, 0, 0, 0 }; // {i, v, x, l, c}
		
		while (input > 99) {
			arrayInput[4]++;
			input -= 100;
		}

		if (input >= 90) {
			arrayInput[4]++;
			arrayInput[2]++;
			input -= 90;
		}

		while (input > 39 && input < 90) {
			arrayInput[3]++;
			input -= 50;

			if (input < 0) {
				if (input == -10) {
					arrayInput[2]++;
				} else {
					input *= -1;
				}
			}
		}

		while (input > 9) {
			arrayInput[2]++;
			input -= 10;
		}

		if (input == 9) {
			arrayInput[2]++;
			arrayInput[0]++;
			input -= 9;
		}

		while (input > 3) {
			arrayInput[1]++;
			input -= 5;

			if (input < 0) {
				arrayInput[0]++;
				input += 1;
			}
		}

		while (input != 0) {
			arrayInput[0]++;
			input -= 1;
		}

		return arrayInput;
	}
}
