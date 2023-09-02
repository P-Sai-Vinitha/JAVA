import java.util.Scanner;
class numb{
public static void main(String args[])
{
double sum=0;
int n,c=0;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int f=n;
while(n>0)
{
int d=n%10;
c=c+1;
n=n/10;
}

n=f;

while(f>0)
{
int g=f%10;

sum=sum+Math.pow(g,c);

f=f/10;
}
System.out.println(sum);



if(Math.round(sum)==n)
{
System.out.println("armstrong");
}
else
{
System.out.println("not armstrong");
}
}
}

