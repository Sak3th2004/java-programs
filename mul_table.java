import java.util.Scanner;
public class mul_table
{
public static void main(String[] args)
{
int num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to compute Multiplication Table");

num=sc.nextInt();
System.out.println("Multiplication Table for "+num+" is");
for(int i=1;i<=10;i++)
{
System.out.println(num+" * "+i+" = "+ (num*i));
}
}
}