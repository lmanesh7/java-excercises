import java.util.Scanner;

class search
{

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];

for(int i=0;i<n;i++)
{
  arr[i] = sc.nextInt();
}

int s = sc.nextInt();
search o = new search();
if (true^o.linear(arr,s))
System.out.println("Not found");
if(o.binary(arr,s))
System.out.println("Not found");
}

public boolean linear(int[] a, int s1)
{ 
 for(int i=0;i<a.length;i++)
{
  if(a[i]==s1)
  {System.out.println("found at index: "+i);return true;}
}
return false;
}

public boolean binary(int[] a,int s1)
{ a = bubblesort(a);
  for(int i=0;i<a.length;i++)
  System.out.print(a[i]+" ");
   int t = a.length/2;
  if(s1>=t)
  {
    
  for(int i=t;i<a.length;i++)
 {
  if(a[i]==s1)
  {System.out.println("found at index: "+i);return true;}
}
}

else
{   
  for(int i=0;i<t;i++)
 {
  if(a[i]==s1)
  {System.out.println("found at index: "+i);return true;}
}
}

return false;

}

public int[] bubblesort(int[] a)
{
 for(int i=0;i<a.length;i++)
{
  for(int j=0;j<a.length-i-1;j++)
{
   if(a[j]>a[j+1])
 {
    int t = a[j+1];
    a[j+1] = a[j];
    a[j] = t;
}
}
}
return a;
}

}



  

