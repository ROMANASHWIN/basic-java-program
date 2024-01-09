import java.util.Scanner;
class calculator{
    public static void main(String[] args)
    {
        int num;
        int i, fact=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the factorial Number :");
        num=s.nextInt();
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorila of "+fact);
    }
}