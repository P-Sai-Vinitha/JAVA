import java.util.Scanner;
class p{
public static void main(String args[])
{
int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int[] array=new int[n];
for(int i=0;i<n;i++)
{
array[i]=scanner.nextInt();
}
for(int i=0;i<n;i++)
{
int c=0;
for(int j=2;j<array[i];j++)
{
if(array[i]%j==0)
{
c++;
}
}
if(c==0)
{
System.out.println("prime"+array[i]);
}
else
{
System.out.println("not prime"+array[i]);
}
}
}
}