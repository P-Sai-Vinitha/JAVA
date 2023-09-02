import java.util.Scanner;
class EmployeeMain
{
public static void main(String[] args)
{
Employee x=new Employee();
x.emp();
}
}
class Employee
{
public void emp()
{
int n,b;
String name;
Scanner scanner=new Scanner(System.in);
System.out.print("s.no");
n=scanner.nextInt();
System.out.print("basic pay");
b=scanner.nextInt();
System.out.print("name");
name=scanner.nextLine();

int ns,d,gs;
ns=b+(b*10/100)+(b*20/100)+(b*15/100);
d=(b*12/100)+(b*20/100);
gs=ns-d;

System.out.println("net salary:"+ns);
System.out.println("det:"+d);
System.out.println("grass salary:"+gs);
}
}

