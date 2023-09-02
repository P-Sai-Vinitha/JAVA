import java.util.Scanner;
class pett{
public static void main(String args[])
{
int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();

for(int i=n;i>0;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println(" ");
}




}
}
