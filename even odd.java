
import java.util.Scanner;
class area {
    public static void main(String[] args) 
    {
        
       int num1;
        Scanner s=new Scanner(System.in);
        System.out.println("CHECK THE NUMBER IS EVEN OR ODD....");
        System.out.println("Enter the number :");
        num1=s.nextInt();
        if(num1%2==0)
        {
            System.out.println("The given number is even");
        }
        else
        {
             System.out.println("The given number is odd");

        }
       
    }
}