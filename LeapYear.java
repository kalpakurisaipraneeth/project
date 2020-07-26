import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		System.out.println("Enter year");
		Scanner scan=new Scanner(System.in);
		year=scan.nextInt();
		if(year %400==0)
		{
			System.out.println("leap year");
		}
		else if(year % 100==0)
		{
			System.out.println("not a leap year");
		}
		else if(year % 4==0)
		{
			System.out.println("leap year");
	
		}
		else
		{
			System.out.println("not a leap year");
		}
	}

}
