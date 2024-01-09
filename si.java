import java.util.Scanner;

class simple
{
    public static void main(String[] args) {
       int principle,rate,time,SI;
       Scanner s=new Scanner(System.in);
       System.out.println("ENter the Principle value:");
       principle=s.nextInt();
       System.out.println("ENter the rate value:");
       rate=s.nextInt();
       System.out.println("ENter the time value:");
       time=s.nextInt();
       SI=(principle*rate*time)/100;
       System.out.println("the value is :" +SI);
    }
}