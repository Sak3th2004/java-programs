import java.util.Scanner;
public class rightangle
{
public static void main(String[] args)
{
int num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number of Rows in Numbers Right Angle Triangle");

num=sc.nextInt();
System.out.println("Numbers Right Angle Triangle with "+num+" rows is");

for(int i=1;i<=num;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}