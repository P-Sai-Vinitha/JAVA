import java.util.Scanner;
class atm{
public static void main(String args[])
{
int a1,a,b1,b,c1,c,d1,d,e1,e;
Scanner scanner=new Scanner(System.in);
System.out.println("enetr the denomination:");
a1=scanner.nextInt();
System.out.println("enter number of 2000 denominations:");
a=scanner.nextInt();
System.out.println("enetr the denomination:");
b1=scanner.nextInt();
System.out.println("enter number of 500 denominations:");
b=scanner.nextInt();
System.out.println("enetr the denomination:");
c1=scanner.nextInt();
System.out.println("enter number of 200 denominations:");
c=scanner.nextInt();
System.out.println("enetr the denomination:");
d1=scanner.nextInt();
System.out.println("enter number of 100 denominations:");
d=scanner.nextInt();

if(a1!=500 || a1!=200 || a1!=100 || a1!=2000 || b1!=500 || b1!=200 || b1!=100 || b1!=2000 || c1!=500 || c1!=200 || c1!=100 || c1!=2000 || d1!=500 || d1!=200 || d1!=100 || d1!=2000 )
{
System.out.println("invalid");
}
else
{
e=((a1*a)+(b1*b)+(c1*c)+(d1*d));
System.out.println("total ATM balance:"+e);
}

}
}