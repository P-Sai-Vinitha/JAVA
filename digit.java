import java.util.Scanner;
class digit{
public static void main(String args[])
{
int n,r=0,sum=0;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
while(n>0)
{
int d=n%10;
sum=sum+d;
r=r*10+d;
n=n/10;
}
System.out.println(r);
System.out.println(sum);
}
}