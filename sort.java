import java.util.Scanner;
class sort{
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
if(array[i]%2==0)
{
System.out.println("even:"+" "+array[i]);
}
else
{
System.out.println("odd:"+" "+array[i]);
}
}





System.out.println("ascending order:");
for(int i=0;i<n;i++)
{

System.out.print(array[i]+" ");
}
System.out.println("max:"+array[n-1]);
System.out.println("min:"+array[0]);
System.out.println("2nd max:"+array[n-2]);
System.out.println("sum:"+((array[n-1])+(array[0])));
System.out.println("difference:"+((array[n-1])-(array[0])));

}
}

