import java.util.Scanner;
class stu{
public static void main(String args[])
{
int n,r,a,b,c,d,e;
Scanner scanner=new Scanner(System.in);
System.out.print("s.no:");
n=scanner.nextInt();
System.out.print("regno");
r=scanner.nextInt();
System.out.print("sub1:");
a=scanner.nextInt();
if(a>90)
{
System.out.println("S");
}
else if(a>=80 && a<=90)
{
System.out.println("B");
}
else if(a>=70 && a<80)
{
System.out.println("C");
}
else if(a>=60 && a<70)
{
System.out.println("D");
}
else if(a>=50 && a<60)
{
System.out.println("E");
}
else
{
System.out.println("fail");
}

System.out.print("sub2:");
b=scanner.nextInt();
if(b>90)
{
System.out.println("S");
}
else if(b>=80 && b<=90)
{
System.out.println("B");
}
else if(b>=70 && b<80)
{
System.out.println("C");
}
else if(b>=60 && b<70)
{
System.out.println("D");
}
else if(b>=50 && b<60)
{
System.out.println("E");
}
else
{
System.out.println("fail");
}

System.out.print("sub3:");
c=scanner.nextInt();
if(c>90)
{
System.out.println("S");
}
else if(c>=80 && c<=90)
{
System.out.println("B");
}
else if(c>=70 && c<80)
{
System.out.println("C");
}
else if(c>=60 && c<70)
{
System.out.println("D");
}
else if(c>=50 && c<60)
{
System.out.println("E");
}
else
{
System.out.println("fail");
}

System.out.print("sub4:");
d=scanner.nextInt();
if(d>90)
{
System.out.println("S");
}
else if(d>=80 && d<=90)
{
System.out.println("B");
}
else if(d>=70 && d<80)
{
System.out.println("C");
}
else if(d>=60 && d<70)
{
System.out.println("D");
}
else if(d>=50 && d<60)
{
System.out.println("E");
}
else
{
System.out.println("fail");
}

System.out.print("sub 5:");
e=scanner.nextInt();
if(e>90)
{
System.out.println("S");
}
else if(e>=80 && e<=90)
{
System.out.println("B");
}
else if(e>=70 && e<80)
{
System.out.println("C");
}
else if(e>=60 && e<70)
{
System.out.println("D");
}
else if(e>=50 && e<60)
{
System.out.println("E");
}
else
{
System.out.println("fail");
}

if(a>=50 && b>=50 && c>=50 && d>=50 && e>=50 )
{
System.out.println((a+b+c+d+e)/5);
}

}
}


