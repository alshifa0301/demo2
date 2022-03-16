package pack1;
import java.util.*;
public class information {

	String cname;
	int age ;
	int salary;
	
	void add() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Course name : ");
		cname=s.next();
		System.out.println("Enter Course Duration : ");		
		age=s.nextInt();
		System.out.println("Enter Course fees : ");		
		salary = s.nextInt();
	}
	
	void dsplay() {
		System.out.println("Course Name : " + cname);
		System.out.println("Course Duration : " + age);
		System.out.println("Course Fees : " + salary);
		
	}
	
	public static void main(String[] args) {
		Courses c = new Courses();
		c.add();
		c.dsplay();

	}

}
