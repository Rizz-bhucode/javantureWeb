package project;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static boolean isAnagram(String str1, String str2) {
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String str1 = scanner.next();
		System.out.print("Enter second string: ");
		String str2 = scanner.next();
		scanner.close();

		System.out.println(isAnagram(str1,str2));
	}

}
