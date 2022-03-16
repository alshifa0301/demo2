package pack1;
import java.util.*;
public class swap {

	int a,b,temp;
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of A:" );
		a=s.nextInt();
		System.out.println("Enter value of B:" );
		b=s.nextInt();
		System.out.println("\nYou entered : \n A=" + a + "\n B=" + b);
	}
	
	void swapping()
	{
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping : \n" + "A = " + a + "\nB =" + b);
		
	}
	public static void main(String[] args)
	
	{
		swap s= new swap();
		s.input();
		s.swapping();
	}}
