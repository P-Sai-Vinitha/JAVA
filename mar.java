import java.util.Scanner;
class mar
{
public static void main(String args[])
{
int n,m=4;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int[][] mat=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
mat[i][j]=scanner.nextInt();
}
}
}
}