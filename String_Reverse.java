package Exercise_6;

import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String another = "y";
		String input;
		while (another.equalsIgnoreCase("y")) {
			System.out.println("Enter a word");
			input = scan.nextLine();
			char[] in = input.toCharArray();
			for (int i = in.length - 1; i >= 0; i=i-2) {
				System.out.print(in[i]);
			}
			System.out.println();
			System.out.println("Try Again");
			another = scan.nextLine();
		}

	}

}
