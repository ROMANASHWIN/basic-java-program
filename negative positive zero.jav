import java.util.Scanner;

class simple
{
    public static void main(String[] args) 
    {
       int num1;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the number :");
       num1=s.nextInt();
       if(num1<0)
       {
           System.out.println("Negative");
       }
       else if(num1>0)
       {
            System.out.println("positive");

       }
       else
       {
            System.out.println("zero");

       }
}
}