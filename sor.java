import java.util.Scanner;
class sor{
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
for(int j=0;j<n;j++)
{
if(arr[i]<arr[j])
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}

System.out.println("min:"+arr[0]);
System.out.println("max:"+arr[n-1]);
System.out.println("sum:"+(arr[0]+arr[n-1]));
System.out.println("difference:"+(arr[n-1]-arr[0]));
}
}