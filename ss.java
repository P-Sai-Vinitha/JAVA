import java.util.Scanner;
class ss{
public static void main(String args[])
{
int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int[] array=new int[n];
int[] l=new int[n];

for(int i=0;i<n;i++)
{
array[i]=scanner.nextInt();
}

for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(array[i]<array[j])
{
int temp=array[i];
array[i]=array[j];
array[j]=temp;
}
}
}

for(int i=0;i<n;i++)
{
System.out.print(array[i]);
}

for(int i=0;i<n;i++)
{
for(int j=0;j<i;j++)
{
if(array[i]==array[j])
{
l[i]=array[i];
}
}
}

for(int i=0;i<n;i++)
{
if(l[i]!=0)
{
System.out.println(l[i]);
}
}



}
}