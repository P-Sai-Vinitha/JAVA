import java.util.Scanner;
class prim
{
public static void main(String args[])
{
int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for(int i=1;i<=n;i++)
{
int c=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
c++;
}
}
if(c==0)
{
System.out.println(i);
}
}
}
}