import java.util.Scanner;
class perfec{
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
if(i%j==0)
{
sum=sum+j;
}
}

if(sum==i)
{
System.out.println("its perfect num"+i);
}
else
{
System.out.println("not perfect"+i);
}
}
}
}

