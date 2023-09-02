import java.util.Scanner;
class bonus{
public static void main(String args[])
{

Scanner scanner=new Scanner(System.in);
int n=scanner.nextInt();
String grade=scanner.nextLine();
if(grade=="A" && n>=10000)
{
System.out.println("Salary of employee :"+(n*5/100));
}
else if(grade=="A" && n<10000)
{
System.out.println("Salary of employee :"+(n*7/100));
}
else if(grade=="B" && n>=10000)
{
System.out.println("Salary of employee :"+(n*10/100));
}
else if(grade=="B" && n<10000)
{
System.out.println("Salary of employee :"+(n*12/100));
}
else
{
System.out.println("invalid input");
}
}
}