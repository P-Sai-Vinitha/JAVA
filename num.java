import java.util.Scanner;
class num{
public static void main(String args[])
{
int n,sum=0;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for(int i=0;i<n;i++)
{
sum=sum+(Math.pow(i,4));
}
System.out.println(sum);
}
}