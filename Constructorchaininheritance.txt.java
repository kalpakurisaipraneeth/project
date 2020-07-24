class Person
{
	 String name;
	 String gender;
	 public Person(String name,String gender)
	 {
		 this.name=name;
		 this.gender=gender;
				 
	 }
	 public  void display()
	 {
		 System.out.println("Name" +this.name);
		 System.out.println("Gender" +this.gender);
	 }
	
}
class Em extends Person
{
	int empid;
	float empsalary;
	
	public Em(int empid,float empsalary,String name,String gender)
	{
		super(name,gender);
		System.out.println("emp details");
		this.empid=empid;
		this.empsalary=empsalary;
	}
	public void dispalydetails()
	{
		super.display();
		System.out.println("emp id "+this.empid);
		System.out.println("emp salary "+ this.empsalary);
	}
	
}
public class Constructorchaininheritance {
	public static void main(String[] args) {
	Em a=new Em(101,1200,"sai","male");
	//  a.display();
	a.dispalydetails();
	
	}

}
