import java.util.Scanner;
class cspl{
public static void main(String args[])
{
int sum=0;
String s;
Scanner scanner=new Scanner(System.in);
s=scanner.nextLine();

for(int i=0;i<s.length();i++)
{
if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z'))
{
sum=sum+1;
}
}

System.out.println("number of special characters");
System.out.println(s.length()-sum);
}
}