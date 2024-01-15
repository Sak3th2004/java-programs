import java.util.Scanner;
public class naturalnumbers
{
public static void main(String[] args)
{
int num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number to Generate the Natural Number Series");

num=sc.nextInt();
System.out.println("Natural Number Series Till "+num+" is");
for(int i=1;i<=num;i++)
System.out.println(i);
}
}