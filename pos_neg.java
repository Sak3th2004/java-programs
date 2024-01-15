import java.util.*;
public class pos_neg
{
public static void main(String[] args)
{
int num; 
Scanner sc = new Scanner(System.in); 

System.out.println("Enter a NonZero Number to Check");


num=sc.nextInt(); 

if(num==0)

System.out.println("Invaid Number - Zero Valued");
else if(num>0)

System.out.println(num+" is Positive Number");
else

System.out.println(num+" is Negative Number"); 
if(num>0)

System.out.println(num+" is Positive Number");
else

System.out.println(num+" is Negative Number");
}
}