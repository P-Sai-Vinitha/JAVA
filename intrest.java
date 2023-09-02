import java.util.Scanner;
public class intrest {
    public static void main(String args[])
    {
        int age;
        Double p,n,s;
        Scanner scanner=new Scanner(System.in);
        age=scanner.nextInt();
        p=scanner.nextDouble();
        n=scanner.nextDouble();
        if(age>60)
        {
            s=((p*n*10)/100);
        }
        else
        {
            s=((p*n*12)/100);
        }
        System.out.println(s);

    }
}
