import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Year");
		year= scan.nextInt();
		scan.close();
		boolean isleap = false;
		
		if(year % 100 ==0)
		{
			if(year % 100 ==0)
			{
				if(year % 400== 0)
					isleap = true;
				else
					isleap = false;
			}
			else
				isleap = true;
		}
		else {
			isleap = false;
		}
		if(isleap==true)
			System.out.println(year + " is a Leap Year.");
		else
			System.out.println(year+ " is not a Leap Year.");
		
			}
		}

