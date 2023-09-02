import java.util.Scanner;

class summ{
public static void main(String args[])
{
sum x=new sum();
x.add();

}
}


class sum{
int a,b,c;
public void add()
{
Scanner scanner=new Scanner(System.in);
a=scanner.nextInt();
b=scanner.nextInt();
c=a+b;
System.out.println(c);
}
}