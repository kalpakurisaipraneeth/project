import java.util.Scanner;

class Cricketer
{
	private int bcode;
	private String bname;
	private int innings, notout, runs;
	private double batavg;
	Scanner scan =new Scanner(System.in);


	void readdata()
	{System.out.println("bcode");
	this.bcode=scan.nextInt();
	System.out.println("bname");
	this.bname=scan.nextLine();
	scan.nextLine();
	System.out.println("innings");
	this.innings=scan.nextInt();
	System.out.println("notout");
	this.notout= scan.nextInt();
	System.out.println("runs");
	this.runs=scan.nextInt();	
	batavg=runs/(innings-notout);
	}
	public void setbatavg(float batavg)
	{
		this.batavg=batavg;
		
	}
	public double getbatavg()
	{
		return batavg;
	}
	void displaydata()
	{
		System.out.println("bcode  :"+bcode);
		System.out.println("bname  :"+bname);
		System.out.println("innings  :"+innings);
		System.out.println("notout  :"+notout);
		System.out.println("runs     :"+runs);
	}
}
public class Cricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricketer obj=new Cricketer();
		obj.readdata();
		obj.displaydata();
		System.out.println("batavg  :"+obj.getbatavg());
	}

}
