import java.util.Scanner;
class common{
public static void main(String args[])
{
com x=new com();
x.same();
}
}

class com{
public void same()
{
int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int[] arr1=new int[n];
int[] arr2=new int[n];
for(int i=0;i<n;i++)
{
arr1[i]=scanner.nextInt();
}
for(int i=0;i<n;i++)
{
arr2[i]=scanner.nextInt();
}



for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(arr1[i]==arr2[j])
{
System.out.println(arr1[i]);
}
}
}
}
}