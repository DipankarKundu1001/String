package org.String.reverse;

import java.util.Scanner;

public class RevEachWord 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :- ");
		String str = sc.nextLine();
		sc.close();
		int p1 = 0, p2 = 0;
		String revStr = "";
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == ' ' || i == str.length()-1)
			{
				p2 = i-1;
				if(i == str.length()-1)
					p2 = i;
				revStr = revStr + reverse(str,p1,p2) + " ";
				p1 = i+1;
				//System.out.println(revStr);
			}
		}
		System.out.println("Final string is \n" + revStr);
	}
	
	private static String reverse(String str, int p1, int p2)
	{
		String temp="";
		for(int i = p2; i >= p1; i--)
		{
			temp = temp + str.charAt(i);
		}
		return temp;
	}

}


/*
 * i/p :- my name is dipankar kundu
 * o/p :- ym eman si raknapid udnuk
 */
