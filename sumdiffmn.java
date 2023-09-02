import java.util.Scanner;
class sumdiffmn{
public static void main(String args[])
{
int n,m,a;
Scanner scanner=new Scanner(System.in);
System.out.println("size of array : ");
a=scanner.nextInt();
System.out.println("m max value : ");
m=scanner.nextInt();
System.out.println("n min value : ");
n=scanner.nextInt();
int[] arr=new int[a];
for(int i=0;i<a;i++)
{
arr[i]=scanner.nextInt();
}
for(int i=0;i<a;i++)
{
for(int j=0;j<a;j++)
{
if(arr[i]<arr[j])
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}

System.out.println("mth max :"+arr[a-m]);
System.out.println("nth min :"+arr[n-1]);


}
}