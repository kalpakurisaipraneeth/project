import java.util.Scanner;

public class ProfitorLoss {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int costprice,sellingprice;
		int loss,profit;
		System.out.println("enter the costprice and sellingprice");
		Scanner scan=new Scanner(System.in);
		costprice=scan.nextInt();
		sellingprice=scan.nextInt();
		profit = (sellingprice - costprice);
		loss = (costprice - sellingprice);
		if(profit==loss)
		{
			System.out.println("no profit no loss");
		}
		else if(profit>loss)
		{
			System.out.println("profot"+profit);
		}
		else
			System.out.println("lose"+loss);
	}

}
