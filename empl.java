class person
{
public void display()
{
System.out.println("person");
}
}

class admin extends person
{
public void display()
{
System.out.println("account");
}
}

interface account
{
public void display();
}


class b extends admin implements account
{
public void display()
{
double sal=100000.00,bonus=0.05;
System.out.println("bonus:"+sal*bonus+" "+"salary:"+(sal+(sal*bonus)));
}
}

class empl
{
public static void main(String args[])
{
b n=new b();
n.display();
}
}
