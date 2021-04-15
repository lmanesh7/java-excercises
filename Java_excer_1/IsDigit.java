import java.util.Scanner;
import java.lang.*;
class IsDigit{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int i=0;
  do{
    System.out.println("enter a number");
   
    char a = sc.next().charAt(0);
    if (Character.isDigit(a))
    System.out.println("You have entered "+ a);
    else
    System.out.println("not allowed");
    ++i;
    }while(i<10);
  
}}