import java.util.Scanner;
public class three_decimal
{
public static void main(String[] args)
{
float num1,num2;
Scanner in = new Scanner(System.in);
System.out.println("Enter any two Numbers to Compare");
num1=in.nextFloat();
num2=in.nextFloat();
num1=Math.round(num1*1000);
num1=num1/1000;
num2=Math.round(num2*1000);
num2=num2/1000;
if(num1==num2)
System.out.println("The Given Two Numbers are Equal Till Three Decimal Values");

else
System.out.println("The Given Two Numbers are Not Equal");
}
}