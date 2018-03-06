package org.String.reverse;

import java.util.Scanner;

public class RevLastToFirst 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :- ");
		String str = sc.nextLine();
		sc.close();
		for(int i = str.length()-1; i >= 0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}


/*
 * i/p :- my name is dipankar kundu
 * o/p :- udnuk raknapid si eman ym
 */
