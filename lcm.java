import java.util.Scanner;

class lcmd
{
    public static void main(String[] args) 
    {
        int num1,num2,lcm;
        Scanner s=new Scanner(System.in);
        
        System.out.println("lcm");
        System.out.println("Enter the first no:");
        num1=s.nextInt();
        System.out.println("Enter the second  no:");
        num2=s.nextInt();
        lcm = (num1 > num2) ? num1 : num2;
        if((lcm%num1==0)&&(lcm%num2==0))
        {
            System.out.println("lcm is"+lcm);
        }
    }
}