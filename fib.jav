import java.util.Scanner;
class calculator{
    public static void main(String[] args)
    {
        int num1=1,num2=2,num3,fib=10;
        System.out.println(num1+" "+num2);
        Scanner s=new Scanner(System.in);
       
        for(int i=2;i<=fib;i++)
        {
            num3=num1+num2;
            System.out.println(+num3);
            num1=num2;
            num2=num3;
        }
        
    }
}