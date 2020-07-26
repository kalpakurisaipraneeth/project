import java.util.Scanner;

public class TotalExpenses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int quantity, price;
		System.out.println("enter the quantity and price");
		Scanner scan=new Scanner(System.in);
		quantity=scan.nextInt();
		price=scan.nextInt();
		int total=price*quantity;
		if(total>5000)
		{

		double  discount=(total*0.1);
			total= (int) (total-discount);

		}
		System.out.println("total amount"+total);
		
	}

}
