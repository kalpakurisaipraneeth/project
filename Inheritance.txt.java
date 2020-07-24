
import java.util.Scanner;

class sai{
	
	private String studentName;
	private String courseName;
	 private static Scanner scan = new Scanner(System.in);
	//static Scanner scan = new Scanner(System.in);
	public void acceptDetails() {
		System.out.print("Enter Student Name : ");
		this.studentName = scan.nextLine();
		System.out.print("Enter Course Name : ");
		this.courseName = scan.nextLine();
	}
	
	public void displayDetails() {
		System.out.println("--------- Student Information --------");
		System.out.println("Student Name : " + this.studentName);
		System.out.println("Course Name : " + this.courseName);
	}
}

class Marks extends sai {
	
	protected float objectiveMarks;
	protected float subjectiveMarks;
	private static Scanner scan = new Scanner(System.in);

	public void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Objective Marks : ");
		this.objectiveMarks = scan.nextFloat();
		System.out.print("Enter Subjective Marks : ");
		this.subjectiveMarks = scan.nextFloat();
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("--------- Student Information --------");
		System.out.println("Objective Marks : " + this.objectiveMarks);
		System.out.println("Subjective Marks : " + this.subjectiveMarks);
	}
}
	class Sport extends Marks
	{
		protected float Marks;
		private static Scanner scan = new Scanner(System.in);
		public void acceptDetails() {
			super.acceptDetails();
			System.out.print("Enter Marks : ");
			this.Marks = scan.nextFloat();
			
		}
		
		public void displayDetails() {
			super.displayDetails();
			System.out.println("--------- Student Information --------");
			System.out.println("sports  Marks : " + this.Marks);
			
	}

}
	class Result extends Sport
	{
		private float totalmarks;
		private float avgmarks;
		public void cal()
		{
			System.out.println("--------- total marks Information --------");
			this.totalmarks=this.Marks+this.objectiveMarks+this.subjectiveMarks;
			this.avgmarks=this.totalmarks/3;
			System.out.println("total Marks : " + this.totalmarks);
			System.out.println("avg  Marks : " + this.avgmarks);
			System.out.println("status " +checkstatus());
		}
		private String checkstatus()
		{
			if(this.objectiveMarks>70 && this.subjectiveMarks>70 &&this.Marks >75)
			{
				if(this.avgmarks>=70)
				{
					return "you are selected for next round";
			}
			/*  else
			{
				return "sorry you are  not selected for next round";
			}*/
			}
			return "try again";
		}
		
		
	}
	


public class Inheritance {
	
	public static void main(String[] args) {
		
		Result marks = new Result();
		marks.acceptDetails();
	//	marks.getDetails();
	//	marks.getDetails2();
		marks.displayDetails();
	//	marks.putDetails();
	//	marks.putDetails2();
		marks.cal();
	}

}