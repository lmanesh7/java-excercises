import java.util.Scanner;
import java.io.*;
public class MCQ4
{
	

	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in); 
	

	

	String op;
	String con;

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("What is the command keyword to exit a loop in Java?");
	System.out.println("a.quit");
	System.out.println("b.continue");
	System.out.println("c.break");
	System.out.println("d.exit");


	do
	{

	System.out.print("Enter your choice:");
	 

	 op = sc.nextLine();
	 System.out.println(op);

	if (op.compareTo("c")==0 )
	{
	System.out.println("Congratulations the answer is correct");
	}
	
	else if (op.compareTo("q")==0 || op.compareTo("e")==0) {  System.out.println("Exiting...!");break; }
	else System.out.println("Incorrect,better luck next time");

	System.out.print("Again? press y to continue :");
      con=sc.nextLine();
	} while (con.compareTo("y")==0);

	


	  }

	}