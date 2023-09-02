class rectangle
{
public void display()
{
int l=10,b=20;
System.out.println(l*b);
}
}

interface shape
{
public void display();
}

class cuboid extends rectangle implements shape
{
public void display2()
{
int l=1,b=2,h=3;
System.out.println(2*((l*b)+(b*h)+(h*l)));
}
}

class sh
{
public static void main(String args[])
{
cuboid n=new cuboid();
n.display2();
rectangle v=new rectangle();
v.display();
}
}