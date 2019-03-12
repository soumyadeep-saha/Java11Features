package com.soumyadeep.stringMethods;

import java.util.stream.Collectors;

public class StringMethods {

	public static void main(String[] args) {

		/*
		 * isBlank() – This instance method returns a boolean value. Empty Strings and
		 * Strings with only white spaces are treated as blank
		 */
		String str1 = "";
		String str2 = " ";
		String str3 = "     ";
		String str4 = "abcd";
		System.out.println(str1.isBlank());
		System.out.println(str2.isBlank());
		System.out.println(str3.isBlank());
		System.out.println(str4.isBlank());
		
		/*
		 * lines() This method returns a string array which is a collection of all
		 * substrings split by lines
		 */
		String str5 = "a\nb\nc\nd";
		System.out.println(str5);
		System.out.println(str5.lines().collect(Collectors.toList()));
		
		/*
		 * strip(), stripLeading(), stripTrailing() strip() – Removes the white space
		 * from both, beginning and the end of string
		 */
		String str6 = " abcd ";
		System.out.println("|"+str6.strip()+"|");
		System.out.println("|"+str6.stripLeading()+"|");
		System.out.println("|"+str6.stripTrailing()+"|");
		
		/*
		 * repeat(int) The repeat method simply repeats the string that many numbers of
		 * times as mentioned in the method in the form of an int
		 */
		String str7 = "abcdefghij";
		System.out.println(str7.repeat(4));
		
		
		
	}
}
