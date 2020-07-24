
class Student 
{
	private int a;
	private int b;
	public Student()
	{ 
		System.out.println("Default constructor");
		this.a=100;
		this.b=200;
	}
	public Student(int num1)
	{
		this();
		System.out.println("parametraized  constructor");

		 this.a=num1;
	}
	public Student(int num1,int num2)
	{
		this(num1);
		System.out.println("parametraized  constructor");
		
		 this.a=num1;
		this.b=num2;
	}
	public void display()
	{
		System.out.println("num1  "+a);
		System.out.println("num1  "+b);
		
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student1=new Student();
student1.display();
	// Student student2=new Student(10000 );
	//student2.display();
//	Student student3=new Student(10000 ,20000);
//	student3.display();
	

	}

}
