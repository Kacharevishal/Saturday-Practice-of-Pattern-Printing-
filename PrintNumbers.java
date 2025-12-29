package snippet;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Numbers");

		while(true)
		{
			int num = scan.nextInt();
			if(num % 3 == 0 && num % 4 == 0)
			{
				System.out.println("ThreeFour");
			}
			else if( num % 3 == 0)
			{
				System.out.println("Three");
			}
			else if( num % 4 == 0)
			{
				System.out.println("Four");
			}
			else
			{
				System.out.println("Please Enter Next Number");
			}
		}
	}

}
