import java.util.Scanner;
class fl{
public static void main(String args[])
{
int n,d=0 ;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
System.out.println("last digit:"+(n%10));
while(n!=0)
{
d=n%10;
n=n/10;
}
System.out.println("first digit:"+d);
}
}