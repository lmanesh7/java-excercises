package training;
import java.util.*;
public class duplicates {
	

	 public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   String s[] = new String[100];
	   String s1 = sc.nextLine();
	  s = s1.split(" ");
	  String d[] = new String[s.length];int k =0;
	String t = "";
	
	 int c = 0; 
	 for(int i =0 ; i<s.length;i++)
	{ c = 0; 
	  for(int j =0 ; j<s.length;j++)
	  { if(s[i].equals(s[j]))
	     {c=c+1;
	     t = s[j];}

	   }
	 if(c>1&&find(d,t))
	 {
	 System.out.println(t+" is duplicated "+(c-1)+" times");
	 d[k] = t;
	 ++k;
	 
	 }
	} 
	 

	}
	 
	 public static boolean find(String[] s2,String f)
	 {
		 for(int i=0;i<s2.length;i++)
		 { int c=0;
			 if(s2[i]==f)
				 return false;
			 
		 }
		 return true;
	 }

}
