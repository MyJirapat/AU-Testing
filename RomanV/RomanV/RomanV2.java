package week5;
import java.util.Scanner;

public class RomanV2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// 1: Taking n of pages and creating string of Roman page numbers w convertingRomans()
		System.out.print("Enter number of pages: ");
		int pages = reader.nextInt();
		String romansStr = "";
		for (int i = 1; i <= pages; i++) {
			romansStr = convertingRomans(i, romansStr);
		}
		
		// 2: counting number of Roman char's w howManyStr() and print result
		char[] romans = {'i', 'v', 'x', 'l', 'c'};
		for (int i = 0; i < romans.length; i++) {
			System.out.print(howManyStr(romansStr, romans[i])+ " ");
		}
		
		reader.close();
	}
	// returns Roman n as a string of given integer
	public static String convertingRomans(int n, String st) {
		String[] romans = { "c", "l", "x", "ix", "v", "iv", "i" };
		int[] numArray = { 100, 50, 10, 9, 5, 4, 1 };
		int[] saveRomans = new int[7];
		for (int i = 0; i < numArray.length; i++) {
			saveRomans[i] = n / numArray[i];
			for (int j = 0; j < saveRomans[i]; j++) {
				st += romans[i];
			}
			n %= numArray[i];
		}
		return st;
	}
	// returns number of expected chars of given string
	public static int howManyStr(String st, char ch) {
		int count = 0;
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == ch) count++;
		}
		return count;
	}

}
