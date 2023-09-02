import java.util.Scanner;
class eee{
public static void main(String args[])
{
int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=scanner.nextInt();
}
for(int i=0;i<n;i++)
{
System.out.println(Math.sqrt(arr[i]));
}
}
}