import java.util.Scanner;
class factt{
public static void main(String args[])
{
fact x=new fact;
x.factorial();

}
}


class fact{
int n,fact=1;
public void factorial()
{
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for(int i=0;i<n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}