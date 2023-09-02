import java.util.Scanner;
class addrev{
public static void main(String args[])
{
int n,d,rev=0,z,v;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int a=n;
while(n!=0)
{
d=n%10;
rev=rev*10+d;
n=n/10;
}
System.out.println(rev);

while(a!=0)
{
z=a%10;
v=rev%10;
int m=z+v;
System.out.print(m);
a=a/10;
rev=rev/10;
}






}
}