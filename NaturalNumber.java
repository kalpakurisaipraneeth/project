import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
       int n;
       System.out.println("Enter the number");
       n=scan.nextInt();
       int a=(n*(n+1))/2;
       System.out.println("sum of first natural number"+a);
    		   
	}

}
