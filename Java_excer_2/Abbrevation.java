package training;
import java.util.*;
public class Abbrevation {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a name : ");
//int n = sc.nextInt();
String ar[] = new String[1];
String a[] = new String[3];
String s1;
//for(int i=0;i<=n;i++)
//{
	String s = sc.nextLine();
	 a = s.split(" ");
	 s1 = a[0].charAt(0)+"."+a[1].charAt(0)+"."+a[2];
	 ar[0] = s1;
	
	
//}

for(String s2: ar)
	System.out.println(s2);
}
}

