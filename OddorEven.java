import java.util.Scanner;
public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.println("enter the number");
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		if(number%2==0)
		{
			System.out.println("number is an even number");
		}
		else
		{
			System.out.println("number is an odd number");
			
		}
		

	}

}
