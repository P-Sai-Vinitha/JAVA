import java.util.Scanner;
class Sum{

public static void add()
{
int a,b;
Scanner scanner=new Scanner(System.in);
a=scanner.nextInt();
b=scanner.nextInt();
System.out.println(a+b);
}


}
class Sum1
{
public static void main(String[] args)
{
Sum x=new Sum();
x.add();
}
}

