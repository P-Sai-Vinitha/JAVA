import java.util.Scanner;
class perf{
public static void main(String args[])
{
int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for(int i=1;i<=n;i++)
{
int sum=0;
for(int j=1;j<i;j++)
{
if(i==j)
{
System.out.println("perfect num"+i*j);
}
}


}
}
}

