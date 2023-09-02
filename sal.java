import java.util.Scanner;
class sal
{
public static void main(String args[])
{
float a;
Scanner scanner=new Scanner(System.in);
a=scanner.nextFloat();
char b;
b=scanner.next().charAt(0);
if(a<10000 && b=='A')
{
System.out.println("bonus"+a*0.07+" "+"total:"+(a+(a*0.07)));
}
else if(a<10000 && b=='B')
{
System.out.println("bonus"+a*0.12+" "+"total:"+(a+(a*0.12)));
}
else if(a>=10000 && b=='A')
{
System.out.println("bonus"+a*0.05+" "+"total:"+(a+(a*0.05)));
}
else if(a>=10000 && b=='B')
{
System.out.println("bonus"+a*0.10+" "+"total:"+(a+(a*0.10)));
}
else
{
System.out.println("invalid");
}

}
}