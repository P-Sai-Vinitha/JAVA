import java.util.Scanner;
class sortt{
public static void main(String args[]);
{
sort x=new sort();
x.order();
}
}



class sort{
int n;
int[] array=new int[n];
public void order()
{
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
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
System.out.print(array[i]+" ");
}
}
