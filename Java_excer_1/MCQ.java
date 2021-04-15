public class MCQ
{
public static void main(String[] args)
{
  
	


System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
System.out.println("a. int 1x=10");
System.out.println("b. int x=10");
System.out.println("c. float x=10.0f");
System.out.println("d. string x=\"10\"");
System.out.print("Please enter your choice:");
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);  

char op = sc.next().charAt(0);







switch (op)
{
case 'a': System.out.println("Wrong choice"); break;
case 'b': System.out.println("Congratulations the answer is correct!"); break;
case 'c': System.out.println("Wrong choice"); break;
case 'd': System.out.println("Wrong choice"); break;
default: System.out.println("Wrong choice");break;


}


}

}