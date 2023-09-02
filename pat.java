import java.util.Scanner;
class pat{
public static void main(String args[])
{
int n,sum=0;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for(int i=1;i<n;i++)
{
if(i%2==0)
{
sum=sum+(i+(i+1));
}
else
{
sum=sum+(i-(i+1));
}
}
System.out.print(sum);
}
}


