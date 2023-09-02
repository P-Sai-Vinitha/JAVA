import java.util.Scanner;
class dec2oct{
public static void main(String args[])
{
int n,rem=0,i=1,bin=0;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
while(n!=0)
{
rem = n % 8;
n /= 8;
bin+= rem * i;
i*= 10;
}
System.out.println(bin);
}
}




