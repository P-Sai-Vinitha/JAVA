import java.util.Scanner;
class ma{
public static void main(String args[])
{
int n,i,j;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int[] s1=new int[n];
int[] s2=new int[n];
int[] s3=new int[n];
int[] r=new int[n];
int[] total=new int[n];
System.out.println("rollno"+" "+"s1"+" "+"s2"+" "+"s3"+" ");
for(i=0;i<=n;i++)
{
r[i]=scanner.nextInt();
s1[i]=scanner.nextInt();
s2[i]=scanner.nextInt();
s3[i]=scanner.nextInt();
System.out.print("total:"+(s1[i]+s2[i]+s3[i]));
}


for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(s1[i]>s1[j])
{
System.out.println("s1 highest:"+s1[i]);
}
if(s2[i]>s2[j])
{
System.out.println("s2 hightest:"+s2[i]);
}
if(s3[i]>s3[j])
{
System.out.println("s3 hightest:"+s3[i]);
}
}
}



}
}