import java.util.Scanner;

public class greatest_of_three
{

public static void main(String[] args)
{

int num1,num2,num3;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any three Numbers to Check Greatest");
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();

if(num1>num2)
{
if(num1>num3)
System.out.println(num1+" is Greatest among "+num2+" and "+num3);


else
System.out.println(num3+" is Greatest among "+num1+" and "+num2);

}

else
{
if(num2>num3)
System.out.println(num2+" is Greatest among "+num1+" and "+num3);


else
System.out.println(num3+" is Greatest among "+num1+" and "+num2);

}
}
}