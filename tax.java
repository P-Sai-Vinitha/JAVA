import java.util.Scanner;
public class tax {
    public static void main(String args[])
    {
        int income;
        Scanner scanner=new Scanner(System.in);
        income=scanner.nextInt();
        if(income<500000)
        {
            System.out.println((income*0)/100);
        }
        else if(income>=500000 && income<750000)
        {
            System.out.println((income*5)/100);
        }
        else if(income>=750000 && income<1000000)
        {
            System.out.println((income*10)/100);
        }
        else if(income>=1000000 && income<1500000)
        {
            System.out.println((income*12)/100);
        }
        else
        {
            System.out.println((income*20)/100);
        }
    }
}
