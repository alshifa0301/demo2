package pack1;
import java.util.Scanner;
public class Calculator {
	
	Scanner mscan =new Scanner(System.in);

	int a = mscan.nextInt();
	int b = mscan.nextInt();
	
	
	void add() {
		System.out.println("Addition = " + (a+b));
	}
	
	void sub() {
		System.out.println("Substraction = " + (a-b));		
	}
	
	
	public static void main(String[] args) {
		Calculator c = new Calculator() ;
	
		c.add();
		c.sub();
	}

}
