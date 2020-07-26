import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Enter the side of the traingle");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		if(a+b+c==180)
		{
			System.out.println("Traingle");
		}
		else
			System.out.println("Not aTraingle");

	}

}
