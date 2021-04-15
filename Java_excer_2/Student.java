package training;

import java.util.*;

public class Student {
	String name;
	String address;
	int age;
	
	Student()
	{
		name = "unknown";
		age = 0;
		address = "not available";
	}
	 void setInfo(String n, int a)
	{
		name = n;
		age = a;
	}
	void setInfo(String n, int a, String adr)
	{
		name = n;
		age = a;
		address = adr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Scanner sc = new Scanner(System.in);
	  Student[] ar = new Student[10];
      
      String c[] = {"A","B","C","D","E","F","G","H","I","J"};
      for(int i=0,j=21;i<10;i++,j++)
      {  Student s = new Student();
    	  s.setInfo(c[i], j,"hyderabad");
      
      ar[i] = s;
     
       
      }
      for(int i=0;i<10;i++)
      System.out.println(ar[i].name+" "+ar[i].age+" "+ar[i].address);
	}

}
