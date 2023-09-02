import java.util.Scanner;
class enc{
public static void main(String args[])
{
int u=0,l=0;
String s;
Scanner scanner=new Scanner(System.in);
s=scanner.nextLine();
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)=='*')
{
break;
}
else
{
System.out.println(s.charAt(i));
if(s.charAt(i)>='A' && s.charAt(i)<='Z')
{
u=u+1;
}
else
{
l=l+1;
}
}
}

System.out.println("upper:"+u);
System.out.println("lower:"+l);


}
}