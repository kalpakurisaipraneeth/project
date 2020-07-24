abstract  class Person
{
	private String name;
	private String gender;
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
 abstract public void work(); 
 public void changenane(String newName)
 {
	 this.name=newName;
 }

@Override
public String toString() {
	return "Person [name=" + name + ", gender=" + gender + "]";
}
 
}

class Employee extends Person
{
	private int empid;
	private String empsalary;
	
	public Employee(String name, String gender, int empid, String empsalary) {
		super(name, gender);
		this.empid = empid;
		this.empsalary = empsalary;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		if(this.empid<=0)
			System.out.println("not working");
		else
			System.out.println("working as an employee");
	}

	@Override
	public String toString() {
	if(this.empid==0)
	return "person="+super.toString() +"]";
	else
		return "Employee [empid=" + empid + ", empsalary=" + empsalary + ", toString()=" + super.toString() + "]";
	}
	
}




public class AbstractMethod {
	public static void main(String[] args) {
		
		Employee emp=new Employee("sai","male",101,"12000");
		emp.work();
		System.out.println(emp);
		Person  student=new Employee("sai","male",0,"12000");
		student.work();
		System.out.println(student);
		
	}
	

}
//
