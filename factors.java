import java.util.Scanner;
class factors{
public static void main(String args[])
{
int n,m;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();

for(int i=1;i<=n;i++)
{
if(n%i==0)
{
System.out.println("factor "+i);
}
}
System.out.println("enter nth value:");
m=scanner.nextInt();
int c=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
if(c==m)
{
System.out.println("nth factor:"+i);
}
}
}



}
}