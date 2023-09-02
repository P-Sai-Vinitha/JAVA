import java.util.Scanner;
class perfect{
public static void main(String args[])
{
int n,sum=0;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for(int i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}


if(n==sum)
{
System.out.println("perfect");
}
else
{
System.out.println("not perfect");
}
}
}