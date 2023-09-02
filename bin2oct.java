import java.util.Scanner;
class bin2oct{
public static void main(String args[])
{
int n,rem,oct=0,i=0;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
while(n!=0)
{
rem=n%8;
n/=8;
oct+=rem*Math.pow(i,2);
++i;
}
System.out.print(oct/2);
}
}
