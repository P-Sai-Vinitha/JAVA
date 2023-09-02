import java.util.Scanner;
class e{
public static void main(String args[])
{
int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int i=0,s=0;
while(i<n)
{
if(i%2==0){
s=s+i;
}
i=i+1;
}
System.out.println(s);
}
}