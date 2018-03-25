package org.String.others;

import java.util.Scanner;

public class OccurrenceOfLetter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :- ");
		String str = sc.nextLine();
		sc.close();
		
		occurrence(str);
		
	}
	
	public static void occurrence(String str)
	{
		while(str.length() != 0)
		{
			char ch = str.charAt(0);
			int n = str.length() - str.replace(ch+"", "").length();
			System.out.println(ch + " = " + n);
			str = str.replace(ch+"", "");
		}
	}

}
