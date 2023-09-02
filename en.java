import java.util.Scanner;
class en{
public static void main(String args[])
{
int n,sum=0,um=0,c=0,d=0;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=scanner.nextInt();
}

for(int i=0;i<n;i++)
{
if(arr[i]==-1)
{
break;
}
else
{
if(arr[i]<0)
{
sum=sum+arr[i];
c=c+1;
System.out.println("negative :"+arr[i]);
}
else
{
um=um+arr[i];
d=d+1;
System.out.println("positive :"+arr[i]);
}
}
}

System.out.println("avg pos:"+(um/d));
System.out.println("avg neg:"+(sum/c));



}
}