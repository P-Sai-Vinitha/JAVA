import java.util.Scanner;
class bin2dec{
public static void main(String args[])
{
int n,rem,dec=0,i=0;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
while(n!=0)
{
rem=n%10;
n/=10;
dec+=rem*Math.pow(2,i);
++i;
}
System.out.print(dec);
}
}
