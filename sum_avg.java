import java.util.Scanner;
public class sum_avg
{
public static void main(String[] args)
{
int num,temp,sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter total numbers for addition");
num=sc.nextInt();
for(int i=1;i<=num;i++)
{
temp=sc.nextInt();
sum+=temp;
}
System.out.println("Sum of "+num+" numbers is "+sum);
System.out.println("Average of "+num+" numbers is "+(sum/num));
}
}