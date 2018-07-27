import java.util.Scanner;

public class HelloWorld {
	public static void main (String[] args)
	{
		Scanner myScan = new Scanner(System.in);
		String userName;
		int userAge;

		System.out.println("This are the arguments you passed me:");
		for (String str: args)
		{
			System.out.println(str);
		}
		System.out.println();
		System.out.println("What is your name?");
		userName = myScan.nextLine();
		System.out.println("What is your age?");
		try {
			userAge = Integer.parseInt(myScan.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("That was not a number dude");
			return ;
		}

		System.out.println();
		System.out.println("You answered:");
		System.out.println("Name: " + userName);
		System.out.println("Age: " + userAge);
	}
}
