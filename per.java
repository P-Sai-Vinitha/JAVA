import java.util.Scanner;
class per{
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
System.out.println(sum+"is a perfect number");
}
else
{
System.out.println("is not a perfect number");
}

}
}