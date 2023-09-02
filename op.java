import java.util.Scanner;
class op{
public static void main(String args[])
{
int a,b,c;
Scanner scanner=new Scanner(System.in);
a=scanner.nextInt();
b=scanner.nextInt();
c=scanner.nextInt();
switch(c)
{
case 1:
System.out.println(a+b);
break;
case 2:
System.out.println(a-b);
break;
case 3:
System.out.println(a*b);
break;
case 4:
System.out.println(a/b);
break;
default:
System.out.println("invalid");
}
}
}
