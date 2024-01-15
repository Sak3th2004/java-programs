import java.util.Scanner;
class swap_using_temp
{
public static void main(String[] argus)
{
int a,b,temp;
Scanner Myobj=new Scanner(System.in);
System.out.println("enter the value of a:");
a=Myobj.nextInt();
System.out.println("enter the value of b:");
b=Myobj.nextInt();
temp=a;
a=b;
b=temp;
{
System.out.println("the values after swap is "+a+" and "+b);
}
}
}