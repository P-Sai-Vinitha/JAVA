import java.util.Scanner;
class lcmgcd{
public static void main(String args[])
{
int a,b,at,bt,l,g,t;
Scanner scanner=new Scanner(System.in);
System.out.println("enter the number");
a=scanner.nextInt();
b=scanner.nextInt();
at=a;
bt=b;
while(bt!=0)
{
t=bt;
bt=at%bt;
at=t;
}
g=at;
l=(a*b)/g;
System.out.println("lcm:"+l);
System.out.println("gcd:"+g);
}
}