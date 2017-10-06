package Exercise_12;

import java.util.Scanner;

//String Reverse using Recursion.

public class String_Reverse {

	public static void main(String[] args) {

		System.out.println("Enter a String to be reversed.");
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		System.out.println(reverse(a));
        scan.close();
	}

	public static String reverse(String str) {
	    if ((str.equals("")) || (str.length() <= 1)) {
	        return str;
	    }
	    return reverse(str.substring(1)) + str.charAt(0);
	}

}
