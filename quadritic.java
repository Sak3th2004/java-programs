import java.util.*;
import java.lang.Math;
public class quadritic
{
public static void main(String[] args)
{
int a,b,c;

float x1,x2,disc,real,img;

Scanner s=new Scanner(System.in);

System.out.println("Enter the Coefficients (a,b,c) of Equation");

a=s.nextInt();
b=s.nextInt();
c=s.nextInt();

if(a!=0)
{
disc=b*b-4*a*c;

if(disc==0)
{
System.out.println("Roots are REAL and EQUAL");
x1=-b/(2*a);

x2=x1;

System.out.println("Root1 is "+x1+" Root2 is "+x2);
}

else if(disc>0)
{
System.out.println("Roots are REAL and DISTINCT");
x1=(float) ((-b+Math.sqrt(disc))/(2*a));
x2=(float) ((-b-Math.sqrt(disc))/(2*a));
System.out.println("Root1 is "+x1+" Root2 is "+x2);
}

else
{
System.out.println("Roots are IMAGINARY");
real=-b/(2*a);
img=((float) Math.sqrt(Math.abs(disc)))/(2*a);
System.out.println("Root1 is "+real+" +i "+img);
System.out.println("Root2 is "+real+" -i "+img);
}

}
else
System.out.println("Input a Valid Quadratic Equation");
}
}