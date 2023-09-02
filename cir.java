
class area
{
public void disp(double radius)
{
System.out.println(Math.PI*radius*radius);
}
}

class circumference extends area
{
public void disp(double radius)
{
System.out.println(2*Math.PI*radius);
}
}

class cir
{
public static void main(String args[])
{
double radius = 5.0;

circumference v=new circumference();
v.disp(radius);
}
}