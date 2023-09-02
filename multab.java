import java.util.Scanner;
class multab{
public static void main(String args[])
{
table x=new table();
x.mul();
}
}

class table{
public void mul()
{
int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println(n+"*"+i+"="+(n*i));
}
}
}