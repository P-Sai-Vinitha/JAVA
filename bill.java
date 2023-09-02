import java.util.Scanner;
class bill{
public static void main(String args[])
{
int s;
int n,c,l;
Scanner scanner=new Scanner(System.in);

for(int i=0;i<5;i++)
{
System.out.print("s.no");
n=scanner.nextInt();
System.out.print("current month:");
c=scanner.nextInt();
System.out.print("last month:");
l=scanner.nextInt();
System.out.print("1.industry  2.domestic");
s=scanner.nextInt();

switch(s)
{
case 1:
if((c<100))
{
System.out.println("bill="+((l-c)*0));
}
else if((c>=101 && c<=200))
{
System.out.println("bill="+((l-c)*1.25));
}
else if((c>=201 && c<=300) )
{
System.out.println("bill="+((l-c)*2.50));
}
else if((c>=301 && c<=400) )
{
System.out.println("bill="+((l-c)*4.00));
}
else
{
System.out.println("bill="+((l-c)*5.40));
}

case 2:
if((c<=100))
{
System.out.println("bill="+((l-c)*0));
}
else if((c>=101 && c<=200) )
{
System.out.println("bill="+((l-c)*1));
}
else if((c>=201 && c<=300))
{
System.out.println("bill="+((l-c)*2));
}
else if((c>=301 && c<=400))
{
System.out.println("bill="+((l-c)*3.50));
}
else
{
System.out.println("bill="+((l-c)*5));
}

}

}
}
}


