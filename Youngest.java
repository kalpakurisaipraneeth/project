import java.util.Scanner;

public class Youngest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the ages of Ram Sulabh and Ajay");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		if(a<b&&a<c)
		{
	System.out.println("Ram is youngest");
		}
		else if(b<a&&b<c)
		{
			System.out.println("Sulabh is youngest");

		}
		else
		{
			System.out.println("Ajay is youngest");

		}

	}

}
