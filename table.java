import java.util.Scanner;
class table{
public static void main(String args[])
{
int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println(n+"*"+i+"="+(n*i));
}
}
}