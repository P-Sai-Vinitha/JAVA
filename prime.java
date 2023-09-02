class prime{
public static void main(String args[])
{
for(int i=100;i<900;i++)
{
if(i%1==0 && i%i==0)
{
System.out.println(i+" ");
}
}
}
}