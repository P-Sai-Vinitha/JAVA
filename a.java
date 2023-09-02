import java.util.Scanner;
class a{
public static void main(String args[])
{
String a,b;
Scanner scanner=new Scanner(System.in);
a=scanner.nextLine();
b=scanner.nextLine();
if(a.equals(b))
{
System.out.println("valid");
}
else
{
System.out.println("invalid");
}
}
}