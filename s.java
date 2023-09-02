import java.util.Scanner;
class s{
public static void main(String args[])
{
int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int i=0,sum=0;
while(i<n)
{
i=i+1;
sum=sum+i;
}
System.out.println(sum);
}
}