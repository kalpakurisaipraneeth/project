import java.util.Scanner;

class Student
{
	private int admno;
	private String sname;
	private float eng,maths,science,total;
	Scanner scan =new Scanner(System.in);

void takedata()
{
	System.out.println("admno");
	this.admno=scan.nextInt();
	System.out.println("sname");
	this.sname=scan.nextLine();
	scan.nextLine();
	System.out.println("eng");
	this.eng=scan.nextFloat();
	System.out.println("maths");
	this.maths=scan.nextFloat();
	System.out.println("science");
	this.science=scan.nextFloat();	
	this.total=this.eng+this.maths+this.science;
}
void showdata()
{
	System.out.println("admno  :"+admno);
	System.out.println("sname  :"+sname);
	System.out.println("eng    :"+eng);
	System.out.println("maths  :"+maths);
	System.out.println("science:"+science);
}
public float getTotal() {
	return total;
}
public void setTotal(float total) {
	this.total =total;
}
}

public class ClassStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.takedata();
		obj.showdata();
		System.out.println("total   :"+obj.getTotal());
	}

}
