import java.util.Scanner;
class largenumber 
{
    public static void main(String[] args)
    {
        int num,sum=0;
        System.out.println("SUM OF NATURAL NUMBERS...\n");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=s.nextInt();
        for(int i=1;i<=num;++i)
        {
            sum =sum+i;
           
        }
        
        System.out.println("The Sum of Number is :"+sum);
        
    }
    
    
}