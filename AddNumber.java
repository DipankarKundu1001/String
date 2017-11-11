import java.util.Scanner;

public class AddNumber
{
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the string :- ");
		String str = sc.nextLine();
		int sum=0;
		String temp = "";
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) != ' ')
			{	
				if(str.charAt(i) >= 48 && str.charAt(i) >= 57)
					sum = sum + (int)str.charAt(i);
				else
					temp = temp+str.charAt(i);
			}
			temp= temp + sum + " "; 
			sum = 0;
		}
		temp = temp + sum;
		System.out.println(temp);
	}
}