class a
{
public void display()
{
System.out.println("account");
}
}

interface b
{
abstract void display1();
}

class c extends a implements b
{
public void display1()
{
System.out.println("display 1");
}
}

class h
{
public static void main(String args[])
{
c n=new c();
n.display1();
a v=new a();
v.display();
}
}