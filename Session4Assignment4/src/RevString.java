
import java.util.Scanner;

class RevString
{
public static void main(String args[])
{
String rev="";
System.out.println("enter the string");
  Scanner sc= new Scanner(System.in);
  String str=sc.nextLine();
  int len=str.length();
  for(int i=len-1;i>=0;i--)
  rev=rev+str.charAt(i);
  System.out.println("The reversed string is");
  System.out.println(rev);
}
}
