class fruits
{
int c=0;
public void fruits()
{
c=c+1;
System.out.println(c);
}
}

class apple extends fruits
{
int a=0;
public void apple()
{
a=a+1;
System.out.println(a);
}
}

class mango extends apple
{
int c=1;
public void mango()
{
System.out.println(c);
System.out.println(c+c);
}
}


class f
{
public static void main(String args[])
{
mango n=new mango();
n.mango();
}
}