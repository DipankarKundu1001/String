package org.String.reverse;

import java.util.Scanner;

public class RevWord 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :- ");
		String str = sc.nextLine();
		sc.close();
		String revStr = "";
		int p1 = str.length()-1, p2 = str.length()-1;
		for(int i = str.length()-1; i >= 0; i--)
		{
			if(str.charAt(i) == ' ' || i == 0)
			{
				p1 = i + 1;
				if( i == 0)
					p1 = 0;
				revStr = revStr + reverse(str,p1,p2) + " ";
				p2 = i-1;
			}
		}
		System.out.println("Final reverse String is \n" + revStr);
	}
	
	private static String reverse(String str, int p1, int p2)
	{
		String temp = "";
		for(int i = p1; i <= p2; i++)
		{
			temp =  temp + str.charAt(i);
		}
		return temp;
	}

}


/*
 * i/p :- My name is Dipankar Kundu
 * o/p :- Kundu Dipankar is name my
 */