import java.util.Scanner;
class nth{
public static void main(String args[])
{
int nth,n;
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

System.out.print("nth value:");
nth=scanner.nextInt();

System.out.println(nth+"largest :"+arr[n-nth]);
}
}