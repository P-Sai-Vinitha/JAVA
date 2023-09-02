import java.util.Scanner;
class palinnum{
public static void main(String args[])
{
int n,rev=0;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int f=n;
while(n>0)
{
int d=n%10;
rev=rev*10+d;
n=n/10;
}

if(rev==f)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}