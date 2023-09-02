import java.util.Scanner;
class student{
public static void main(String args[])
{
int z=5;
String name;
int n,r,s1,s2,s3,s4,s5;
Scanner scanner=new Scanner(System.in);

for(int i=0;i<z;i++)
{
System.out.println(" ");
System.out.println(" ");
System.out.println("next student");
System.out.print("s.no:");
n=scanner.nextInt();
System.out.print("reg no:");
r=scanner.nextInt();
System.out.print("sub1:");
s1=scanner.nextInt();
if(s1>90)
{
System.out.println("S");
}
else if((s1>81 && s1<=90))
{
System.out.println("A");
}
else if((s1>71 && s1<=80))
{
System.out.println("B");
}
else if((s1>61 && s1<=70))
{
System.out.println("C");
}
else if((s1>=50 && s1<=60))
{
System.out.println("D");
}
else
{
System.out.println("fail");
}
System.out.print("sub2:");
s2=scanner.nextInt();

if(s2>90)
{
System.out.println("S");
}
else if((s2>81 && s2<=90))
{
System.out.println("A");
}
else if((s2>71 && s2<=80))
{
System.out.println("B");
}
else if((s2>61 && s2<=70))
{
System.out.println("C");
}
else if((s2>=50 && s2<=60))
{
System.out.println("D");
}
else
{
System.out.println("fail");
}

System.out.print("sub3:");
s3=scanner.nextInt();

if(s3>90)
{
System.out.println("S");
}
else if((s3>81 && s3<=90))
{
System.out.println("A");
}
else if((s3>71 && s3<=80))
{
System.out.println("B");
}
else if((s3>61 && s3<=70))
{
System.out.println("C");
}
else if((s3>=50 && s3<=60))
{
System.out.println("D");
}
else
{
System.out.println("fail");
}

System.out.print("sub4:");
s4=scanner.nextInt();

if(s4>90)
{
System.out.println("S");
}
else if((s4>81 && s4<=90))
{
System.out.println("A");
}
else if((s4>71 && s4<=80))
{
System.out.println("B");
}
else if((s4>61 && s4<=70))
{
System.out.println("C");
}
else if((s4>=50 && s4<=60))
{
System.out.println("D");
}
else
{
System.out.println("fail");
}

System.out.print("sub5:");
s5=scanner.nextInt();


if(s5>90)
{
System.out.println("S");
}
else if((s5>81 && s5<=90))
{
System.out.println("A");
}
else if((s5>71 && s5<=80))
{
System.out.println("B");
}
else if((s5>61 && s5<=70))
{
System.out.println("C");
}
else if((s5>=50 && s5<=60))
{
System.out.println("D");
}
else
{
System.out.println("fail");
}





if(s1>=50 && s2>=50 && s3>=50 && s4>=50 && s5>=50)
{
System.out.println("average:"+((s1+s2+s3+s4+s5)/5));
}



}



}
}