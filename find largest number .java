import java.util.Scanner;
class largenumber 
{
    public static void main(String[] args)
    {
        int num1,num2,num3;
        Scanner s=new Scanner(System.in);
        System.out.println("Find the largest number\n");
        System.out.println("Enter the number 1:");
        num1=s.nextInt();
        System.out.println("Enter the number 2:");
        num2=s.nextInt();
        System.out.println("Enter the number 3:");
        num3=s.nextInt();
        if((num1>num2) && (num1>num3))
        {
            System.out.println("The biggest number is :"+num1);
        }
        else if((num2>num1)&&(num2>num3))
        {
            System.out.println("The biggest number is :"+num2);
        }
        else
        {
            System.out.println("the biggest number is :"+num3);
        }
    }
    
    
}