import java.util.Scanner;
class cpricom{
public static void main(String args[])
{
int n,c=0,p=0;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=scanner.nextInt();
}


for(int i=0;i<n;i++)
{
for(int j=2;j<n;j++)
{
if(arr[i]%j!=0)
{
System.out.println(arr[i]+" prime");
c=c+1;
break;
}
else
{
System.out.println(arr[i]+" composite");
p=p+1;
break;
}
}
}

System.out.println("prime:"+p);
System.out.println("composite:"+c);
}
}