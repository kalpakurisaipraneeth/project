import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1;
		System.out.println("enter the number");
		Scanner scan=new Scanner(System.in);
		number1=scan.nextInt();
		number1=Math.abs(number1);
	System.out.println("absolute value of number"+number1);
	}

}
