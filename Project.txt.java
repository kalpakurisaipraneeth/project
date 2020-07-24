import java.util.Scanner;
abstract class Bank {

	abstract void deposit();

	abstract void withdraw();

	abstract void balance();

}
class Saving extends Bank
{
	private int amount=10000;
 private Scanner a=new 	Scanner(System.in);
	@Override
	void deposit() {
		int amount1=a.nextInt();
		amount+=amount1;
		System.out.println("with draw Account."+amount);
		
	}

	@Override
	void withdraw() {
		int withdraw ;
		withdraw=a.nextInt();
		if(withdraw>5000 || withdraw <5000) {
			System.out.println("insufficient balance");
		}
		amount-=withdraw;
	//	System.out.println(amount);
	}

	@Override
	void balance() {		
		System.out.println(amount);
	}
	
}
class Current extends Bank
{

	private int totalamount=100000;
	private Scanner a=new 	Scanner(System.in);
	@Override
	void deposit() {
		int amount2;
		amount2=a.nextInt();
		totalamount=amount2;
		System.out.println(totalamount);
		
	}

	@Override
	void withdraw() {
		int withdraw1;
		withdraw1=a.nextInt();
		totalamount-=withdraw1;
		 // System.out.println(totalamount);
	
		
	}

	@Override
	void balance() {
		System.out.println(totalamount);
		
	}
	
}
 
public class Projeect {

	private static char ch;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int totalamount= 10000;
		 int a;
		 System.out.println("select 1.SavingAccount \n       2.CurrentAccount ");
		 Scanner scan=new Scanner(System.in);
		 a=scan.nextInt();
		 switch(a)
		 {
		 case 1:
			 while(true)
		 		{
				
				System.out.println("Enter your Choice");
		 		System.out.println(" 1.Withdraw \n 2.deposit \n 3.Checkbalance");
		 		Saving obj=new Saving();
			      int   num=scan.nextInt();
		 		switch(num)
				{
				case 1:System.out.println("Enter amount"); 
						obj.withdraw();
				        break;
				case 2:System.out.println("Enter amount");
						obj.deposit();
				        break;
				case 3:System.out.println("Checkbalance");
						obj.balance();
				        break;
				default :System.out.println("Select valid number");
				        break;		
				}
		 		System.out.println("------Transaction Successful------");
		 		System.out.println("enter y to continue , n  to exit" );
		 		char ch=scan.next().charAt(0);
		 		if(ch=='n')
		 		{
		break;
		 		}
		 		}
			 break;
		 case 2:
			 while(true)
		 		{
			 	//System.out.println("------Transaction Successful------");
		        Current obj2=new Current();
		        System.out.println(" 1.Withdraw \n 2.deposit \n 3.Checkbalance");
				System.out.println("Enter your Choice");
				//System.out.println("------Transaction Successful------");
				int   num1=scan.nextInt();
		        switch(num1)
				{
				case 1:System.out.println("Enter amount"); 
						obj2.withdraw();
				        break;
				case 2:System.out.println("Enter amount");
						obj2.deposit();
				        break;
				case 3:System.out.println("Checkbalance");
						obj2.balance();
				        break;
				default :System.out.println("Select valid number");
				        break;		
				}
		        System.out.println("------Transaction Successful------");
		        System.out.println("enter y to continue , n  to exit" );
		 		char ch=scan.next().charAt(0);
		 		if(ch=='n')
		 		{
		 			break;
		 		}
		 		}
		 		break;		
 default:System.out.println("Select valid number");
	        	break;		 	
		 	}

	}
	}

