import java.util.Scanner;
class primecompo{
public static void main(String args[])
{
int n,c=0;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for(int i=1;i<=n;i++)
{
c=0;
for(int j=2;j<=i;j++)
{
if(i%j==0)
{
c++;
}
}
if(c>1)
{
System.out.println(i +"is compo");
}
else
{
System.out.println(i +"is prime");
}
}

}
}