import java.util.Arrays;
import java.util.Scanner;
class anagram
{
public static void main(String args[])
{
String name1,name2;
Scanner scanner=new Scanner(System.in);
name1=scanner.nextLine();
name2=scanner.nextLine();
char[] array1=name1.toCharArray;
char[] array2=name2.toCharArray;
Arrays.sort(array1);
Arrays.sort(array2);
if(Arrays.equals(array1,array2))
{
System.out.println("anagram");
}
else
{
System.out.println("not anagram");
}
}
}