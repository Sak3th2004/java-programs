import java.util.Scanner;
public class weekday
{
public static void main(String[] args)
{
int num1,rem;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any Number to Get Equilavent Weekday");


num1=sc.nextInt();

rem=num1%7;

if(rem==1)

System.out.println("Sunday");
else if(rem==2)
System.out.println("Monday");
else if(rem==3)
System.out.println("Tuesday");
else if(rem==4)
System.out.println("Wednesday");
else if(rem==5)
System.out.println("Thursday");
else if(rem==6)
System.out.println("Friday");
else
System.out.println("Saturday");
}
}