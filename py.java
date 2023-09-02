import java.util.Scanner;
class py
{
public static void main(String args[])
{
int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
if(i!=1 || i!=j )
{
System.out.print(" ");
}
else
{
System.out.print("*");
}
}
System.out.println("");
}
}
}
