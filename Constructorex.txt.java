import java.util.Scanner;
class Emp
{
	private int id;
	private String name;
	private static  Scanner scan=new Scanner(System.in);
	
	public void entry()
	{
		
		this.id=scan.nextInt();
		this.name=scan.nextLine();
	}
	
	public void display()
	{
		System.out.println("id"+this.id);
		System.out.println("name"+this.name);
		
	}
	
	
}
public class Constructorex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Emp e1=new Emp();
		e1.entry();
	e1.display();
	}

}
