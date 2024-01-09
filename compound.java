
import java.util.Scanner;
class compound {
    public static void main(String[] args) 
    {
       int principle,rate,time,compound;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Principle Value:");
        principle=s.nextInt();
        System.out.println("Enter the Rate Value:");
        rate=s.nextInt();
        System.out.println("Enter the time Value:");
        time=s.nextInt();
        compound=principle*(1+rate/100)*time;
        System.out.println("The compound value is :"+compound);
    }
}