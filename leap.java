import java.util.Scanner;
class largenumber 
{
    public static void main(String[] args)
    {
        int num;
        System.out.println("SUM OF NATURAL NUMBERS...\n");
        Scanner s=new Scanner(System.in);
        System.out.println("enter the year");
        num=s.nextInt();
        if(num%4==0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("non leap");
        }
    
    }
}