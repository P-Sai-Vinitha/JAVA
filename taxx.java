import java.util.Scanner;
public class taxx {
    public static void main(String args[])
    {
        int income;
        Scanner scanner=new Scanner(System.in);
        income=scanner.nextInt();
        if(income>500000)
        {
            System.out.println((income*30)/100);
        }
        else if(income>=300000 && income<500000)
        {
            System.out.println((income*20)/100);
        }
        else if(income>=150000 && income<3000000)
        {
            System.out.println((income*30)/100);
        }
       
        else
        {
            System.out.println((income*0)/100);
        }
    }
}
