class pascal{
public static void main(String args[])
{
for(int i=0;i<5;i++)
{
int val=1;
for(int j=1;j<=(5-i);j++)
{
System.out.print(" ");
}
for(int k=0;k<=i;k++)
{
System.out.print(val +" ");
val=val*(i-k)/(k+1);
}
System.out.println();
}
}
}