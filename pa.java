import java.util.Scanner;
class pa{
public static void main(String args[])
{
int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<i;j++)
{
for(int k=0;k<i;k++)
{
System.out.print("9"+" ");
}
}
System.out.println(" ");
}
}
}
