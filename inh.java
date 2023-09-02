class a
{
public void display()
{
System.out.println("grand father");
}
}

class b extends a
{
public void display1()
{
System.out.println("grandson");
}
}

class inh
{
public static void main(String args[])
{
b n=new b();
n.display1();
n.display();
}
}
