import java.util.Scanner;
public class leapyear
{
public static void main(String[] args)
{
int year;
Scanner sc = new Scanner(System.in);
System.out.println("Enter an Year to check for Leap Year");
year=sc.nextInt();
if(((year%4==0)&&(year%100!=0))||(year%400==0))
System.out.println(year+" is a Leap Year");
else
System.out.println(year+" is Not a Leap Year");
}
}