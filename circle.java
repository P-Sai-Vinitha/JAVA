
class c
{
Double area(double radius1)
{
return 2*Math.PI*radius1;

}
Double area(int radius1,Double radius2)
{
return Math.PI*radius1*radius2;
}
}

class circle
{
public static void main(String args[])
{
c n=new c();
System.out.println(n.area(5.0));
System.out.println(n.area(5,5.0));
}
}